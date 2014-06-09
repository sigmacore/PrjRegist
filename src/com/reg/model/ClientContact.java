/**
 *
 */
package com.reg.model;

/**
 * @author hao
 */
public class ClientContact {

	private int cId;
	private String fname;
	private String lname;
	private String cname;
	private Address address;
	private long hphone;
	private long wphone;
	private long cphone;
	private String email;
	private String residence;
	private SocialGroup group;
	private ClientInfo ci;

	public ClientContact() {
	}

	public ClientContact(String fname, String lname, String cname, Address address, long hphone,
		long wphone, long cphone, String email, String residence, SocialGroup group, ClientInfo ci) {
		this.fname = fname;
		this.lname = lname;
		this.cname = cname;
		this.address = address;
		this.hphone = hphone;
		this.wphone = wphone;
		this.cphone = cphone;
		this.email = email;
		this.residence = residence;
		this.group = group;
		this.ci = ci;
	}

	public int getcId() {
		return this.cId;
	}

	public void setcId(int id) {
		this.cId = id;
	}

	public String getfname() {
		return this.fname;
	}

	public void setfname(String fname) {
		this.fname = fname;
	}

	public String getlname() {
		return this.lname;
	}

	public void setlname(String lname) {
		this.lname = lname;
	}

	public String getcname() {
		return this.cname;
	}

	public void setcname(String cname) {
		this.cname = cname;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public long gethphone() {
		return this.hphone;
	}

	public void sethphone(long hphone) {
		this.hphone = hphone;
	}

	public long getwphone() {
		return this.wphone;
	}

	public void setwphone(long wphone) {
		this.wphone = wphone;
	}

	public long getcphone() {
		return this.cphone;
	}

	public void setcphone(long cphone) {
		this.cphone = cphone;
	}

	public String getemail() {
		return this.email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	public String getresidence() {
		return this.residence;
	}

	public void setresidence(String residence) {
		this.residence = residence;
	}

	public SocialGroup getSocialGroup() {
		return this.group;
	}

	public void setSocialGroup(SocialGroup group) {
		this.group = group;
	}

	public ClientInfo getClientInfo() {
		return this.ci;
	}

	public void setClientInfo(ClientInfo ci) {
		this.ci = ci;
	}
}
