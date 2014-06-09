/**
 *
 */
package com.reg.model;

/**
 * @author hao
 */
public class SpeakingAbility {

    private int cId;
    private String speaking;
    private ClientInfo ci;

    public SpeakingAbility() {
    }

    public SpeakingAbility(String speaking) {

	if (speaking == null) {
	    return;
	} else {
	    this.speaking = speaking;
	}
	System.out.println("2311 Creating SpeakingAbility instance: "
		+ speaking);

    }

    public int getcId() {
	return this.cId;
    }

    public void setcId(int id) {
	this.cId = id;
    }

    public String getspeaking() {
	return this.speaking;
    }

    public void setspeaking(String speaking) {
	this.speaking = speaking;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (!this.getClass().equals(obj.getClass())) {
	    return false;
	}

	SpeakingAbility obj2 = (SpeakingAbility) obj;
	if ((this.cId == obj2.getcId())
		&& (this.speaking.equals(obj2.getspeaking()))) {
	    return true;
	}
	return false;
    }

    @Override
    public int hashCode() {
	int tmp = 0;
	tmp = (this.cId + this.speaking).hashCode();
	return tmp;
    }

    public ClientInfo getClientInfo() {
	return this.ci;
    }

    public void setClientInfo(ClientInfo ci) {
	this.ci = ci;
    }
}