/**
 *
 */
package com.reg.model;

/**
 * @author hao
 */
public class Address {

	/**
	 *
	 */

	private int cId;
	private String addr;
	private int num;
	private int apt;
	private String town;
	private String state;
	private int zip;
	private ClientContact cc;

	public Address() {
	}

	public Address(String addr, int num, int apt, String town, String state, int zip) {

		this.addr = addr;
		this.num = num;
		this.apt = apt;
		this.town = town;
		this.state = state;
		this.zip = zip;

	}

	public int getcId() {
		return this.cId;
	}

	public void setcId(int id) {
		this.cId = id;
	}

	public String getaddr() {
		return this.addr;
	}

	public void setaddr(String addr) {
		this.addr = addr;
	}

	public int getnum() {
		return this.num;
	}

	public void setnum(int num) {
		this.num = num;
	}

	public int getapt() {
		return this.apt;
	}

	public void setapt(int apt) {
		this.apt = apt;
	}

	public String gettown() {
		return this.town;
	}

	public void settown(String town) {
		this.town = town;
	}

	public String getstate() {
		return this.state;
	}

	public void setstate(String state) {
		this.state = state;
	}

	public int getzip() {
		return this.zip;
	}

	public void setzip(int zip) {
		this.zip = zip;
	}

	public ClientContact getClientContact() {
		return this.cc;
	}

	public void setClientContact(ClientContact cc) {
		this.cc = cc;
	}
}
