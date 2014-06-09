/**
 *
 */
package com.reg.model;

/**
 * @author hao
 *
 */
public class WritingAbility {

    private int cId;
    private String writing;
    private ClientInfo ci;

    public WritingAbility() {
    }

    public WritingAbility(String writing) {
	this.writing = writing;
    }

    public int getcId() {
	return this.cId;
    }

    public void setcId(int id) {
	this.cId = id;
    }

    public String getwriting() {
	return this.writing;
    }

    public void setwriting(String writing) {
	this.writing = writing;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (!this.getClass().equals(obj.getClass())) {
	    return false;
	}

	WritingAbility obj2 = (WritingAbility) obj;
	if ((this.cId == obj2.getcId())
		&& (this.writing.equals(obj2.getwriting()))) {
	    return true;
	}
	return false;
    }

    @Override
    public int hashCode() {
	int tmp = 0;
	tmp = (this.cId + this.writing).hashCode();
	return tmp;
    }

    public ClientInfo getClientInfo() {
	return this.ci;
    }

    public void setClientInfo(ClientInfo ci) {
	this.ci = ci;
    }
}
