/**
 *
 */
package com.reg.action;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.reg.model.Address;
import com.reg.model.ClientContact;
import com.reg.model.ClientInfo;
import com.reg.model.LanguagePreference;
import com.reg.model.ReadingAbility;
import com.reg.model.SocialGroup;
import com.reg.model.SpeakingAbility;
import com.reg.model.WritingAbility;

/**
 * @author hao
 */
public class ClientAction {

    public ClientAction() {
	System.out.println("2311 Creating ClientAction instance");
    };

    private static SessionFactory factory;

    // private ServiceRegistry serviceRegistry;

    public boolean createNewClient(String fname, String lname, String cname,
	    int num, String addr, String town, String state, int zip,
	    long hphone, long wphone, long cphone, String email,
	    String residence, String residenceo, String group, int month,
	    int day, int year, int age, String gender, String CoB, String CoBo,
	    String saEnglish, String saMandarin, String saCantonese,
	    String sataishanhua, String sp, String raEnglish,
	    String rajiantizhongwen, String rafanti, String rp,
	    String waEnglish, String wajiantizhongwen, String wafanti, String wp) {

	/* Create Basic Entity Objects */
	/*
	 * 3 input for each of these. There will be a set for each category for
	 * one-to-many mapping
	 */

	System.out.println("2311: Passing Parameters");

	System.out.println("2311 Model instances");

	// set for reading ability

	LanguagePreference lp = new LanguagePreference(sp, rp, wp);

	if (CoBo != null) {
	    CoB = CoBo; // Overridden
	}

	ClientInfo ci = new ClientInfo(day, month, year, age, gender, CoB, lp);

	// Speaking Ability
	if (saEnglish != null) {
	    SpeakingAbility ra1 = new SpeakingAbility("English");
	    ci.getsa().add(ra1);
	    ra1.setClientInfo(ci);
	}
	if (saMandarin != null) {
	    SpeakingAbility ra2 = new SpeakingAbility("Mandarin");
	    ci.getsa().add(ra2);
	    ra2.setClientInfo(ci);
	}
	if (saCantonese != null) {
	    SpeakingAbility SpeakingAbility = new SpeakingAbility(
		    "TaishanDialect");
	    ci.getsa().add(SpeakingAbility);
	    SpeakingAbility.setClientInfo(ci);
	}

	if (sataishanhua != null) {
	    SpeakingAbility SpeakingAbility = new SpeakingAbility("Cantonese");
	    ci.getsa().add(SpeakingAbility);
	    SpeakingAbility.setClientInfo(ci);
	}

	// Reading Ability
	if (raEnglish != null) {
	    ReadingAbility ra1 = new ReadingAbility("English");
	    ci.getra().add(ra1);
	    ra1.setClientInfo(ci);
	}
	if (rajiantizhongwen != null) {
	    ReadingAbility ra2 = new ReadingAbility("SimplifiedChinese");
	    ci.getra().add(ra2);
	    ra2.setClientInfo(ci);
	}
	if (rafanti != null) {
	    ReadingAbility ra3 = new ReadingAbility("TraditionalChinese");
	    ci.getra().add(ra3);
	    ra3.setClientInfo(ci);
	}

	// Writing Ability
	if (waEnglish != null) {
	    WritingAbility wa1 = new WritingAbility("English");
	    ci.getwa().add(wa1);
	    wa1.setClientInfo(ci);
	}
	if (wajiantizhongwen != null) {
	    WritingAbility wa2 = new WritingAbility("SimplifiedChinese");
	    ci.getwa().add(wa2);
	    wa2.setClientInfo(ci);
	}
	if (wafanti != null) {
	    WritingAbility wa3 = new WritingAbility("TraditionalChinese");
	    ci.getwa().add(wa3);
	    wa3.setClientInfo(ci);
	}
	Address add = new Address(addr, num, 0, town, state, zip);

	SocialGroup sg = new SocialGroup(group);

	if (residenceo != null) {
	    residence = residenceo;
	}

	ClientContact cc = new ClientContact(fname, lname, cname, add, hphone,
		wphone, cphone, email, residence, sg, ci);

	add.setClientContact(cc);
	sg.setClientContact(cc);
	ci.setClientContact(cc);
	lp.setClientInfo(ci);

	/*****
	 * SocialGroup sg = new SocialGroup(group); if (residenceo != null) {
	 * residence = residenceo; } ClientContact cc = new ClientContact(fname,
	 * lname, cname, add, hphone, wphone, cphone, email, residence, sg);
	 * cc.setci(ci);
	 */
	// Persistence
	try {

	    Configuration configuration = new Configuration();

	    /*
	     * ClientAction.serviceRegistry = new
	     * ServiceRegistryBuilder().applySettings
	     * (configuration.getProperties()).build();
	     */
	    ClientAction.factory = configuration.configure()
		    .buildSessionFactory();// ClientAction.serviceRegistry);

	} catch (Throwable ex) {
	    System.err.println("Failed to create sessionFactory." + ex);
	    throw new ExceptionInInitializerError(ex);
	}

	Session session = ClientAction.factory.openSession();
	Transaction tx = null;

	try {
	    tx = session.beginTransaction();

	    session.save(cc);

	    tx.commit();
	} catch (HibernateException e) {
	    if (tx != null) {
		tx.rollback();
	    }
	    System.out.println(e);
	    return false;
	} finally {
	    session.close();
	}
	return true;
    }
}
