/**
 *
 */
package com.reg.model;

import java.util.HashSet;
import java.util.Set;

/**
 * @author hao
 */
public class ClientInfo {

    private int cId;
    private int day;
    private int month;
    private int year;
    private int age;
    private String gender;
    private String CoB;
    private LanguagePreference lp;
    private ClientContact cc;

    private Set<SpeakingAbility> sa = new HashSet<SpeakingAbility>();
    private Set<ReadingAbility> ra = new HashSet<ReadingAbility>();
    private Set<WritingAbility> wa = new HashSet<WritingAbility>();

    public ClientInfo() {
    }

    public ClientInfo(int day, int month, int year, int age, String gender,
	    String CoB, LanguagePreference lp) {
	this.day = day;
	this.month = month;
	this.year = year;
	this.age = age;
	this.gender = gender;
	this.CoB = CoB;
	this.lp = lp;
    }

    public int getcId() {
	return this.cId;
    }

    public void setcId(int id) {
	this.cId = id;
    }

    public int getday() {
	return this.day;
    }

    public void setday(int day) {
	this.day = day;
    }

    public int getmonth() {
	return this.month;
    }

    public void setmonth(int month) {
	this.month = month;
    }

    public int getyear() {
	return this.year;
    }

    public void setyear(int year) {
	this.year = year;
    }

    public int getage() {
	return this.age;
    }

    public void setage(int age) {
	this.age = age;
    }

    public String getgender() {
	return this.gender;
    }

    public void setgender(String gender) {
	this.gender = gender;
    }

    public String getCoB() {
	return this.CoB;
    }

    public void setCoB(String CoB) {
	this.CoB = CoB;
    }

    public Set<ReadingAbility> getra() {
	return this.ra;
    }

    public void setra(Set<ReadingAbility> ra) {
	this.ra = ra;
    }

    public Set<SpeakingAbility> getsa() {
	return this.sa;
    }

    public void setsa(Set<SpeakingAbility> sa) {
	this.sa = sa;
    }

    public Set<WritingAbility> getwa() {
	return this.wa;
    }

    public void setwa(Set<WritingAbility> wa) {
	this.wa = wa;
    }

    public LanguagePreference getLanguagePreference() {
	return this.lp;
    }

    public void setLanguagePreference(LanguagePreference lp) {
	this.lp = lp;
    }

    public ClientContact getClientContact() {
	return this.cc;
    }

    public void setClientContact(ClientContact cc) {
	this.cc = cc;
    }
}
