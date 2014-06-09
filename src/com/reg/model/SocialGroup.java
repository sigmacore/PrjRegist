/**
 *
 */
package com.reg.model;

/**
 * @author hao
 */
public class SocialGroup {

	private int cId;
	private String group;
	private ClientContact cc;

	public SocialGroup() {
	}

	public SocialGroup(String group) {
		this.group = "group";
	}

	public int getcId() {
		return this.cId;
	}

	public void setcId(int id) {
		this.cId = id;
	}

	public String getgroup() {
		return this.group;
	}

	public void setgroup(String group) {
		this.group = group;
	}

	/*
	 * @Override public boolean equals(Object obj) { if (obj == null) { return false; } if
	 * (!this.getClass().equals(obj.getClass())) { return false; } SocialGroup obj2 = (SocialGroup) obj; if ((this.cId ==
	 * obj2.getcId()) && (this.group.equals(obj2.getgroup()))) { return true; } return false; }
	 * @Override public int hashCode() { int tmp = 0; tmp = (this.cId + this.group).hashCode(); return tmp; }
	 */
	public ClientContact getClientContact() {
		return this.cc;
	}

	public void setClientContact(ClientContact cc) {
		this.cc = cc;
	}
}
