/**
 *
 */
package com.reg.model;

/**
 * @author hao
 */
public class LanguagePreference {

	private int cId;
	private String s;
	private String r;
	private String w;
	private ClientInfo ci;

	public LanguagePreference() {
	}

	public LanguagePreference(String s, String r, String w) {
		this.s = s;
		this.r = r;
		this.w = w;
	}

	public int getcId() {
		return this.cId;
	}

	public void setcId(int id) {
		this.cId = id;
	}

	public String gets() {
		return this.s;
	}

	public void sets(String s) {
		this.s = s;
	}

	public String getr() {
		return this.r;
	}

	public void setr(String r) {
		this.r = r;
	}

	public String getw() {
		return this.w;
	}

	public void setw(String w) {
		this.w = w;
	}

	public ClientInfo getClientInfo() {
		return this.ci;
	}

	public void setClientInfo(ClientInfo ci) {
		this.ci = ci;
	}
}
