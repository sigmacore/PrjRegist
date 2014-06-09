/**
 *
 */
package com.reg.model;

/**
 * @author hao
 */
public class ReadingAbility {

	private int cId;
	private String reading;
	private ClientInfo ci;

	public ReadingAbility() {
	}

	public ReadingAbility(String reading) {
		this.reading = reading;
	}

	public int getcId() {
		return this.cId;
	}

	public void setcId(int id) {
		this.cId = id;
	}

	public String getreading() {
		return this.reading;
	}

	public void setreading(String reading) {
		this.reading = reading;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (!this.getClass().equals(obj.getClass())) {
			return false;
		}

		ReadingAbility obj2 = (ReadingAbility) obj;
		if ((this.cId == obj2.getcId()) && (this.reading.equals(obj2.getreading()))) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		int tmp = 0;
		tmp = (this.cId + this.reading).hashCode();
		return tmp;
	}

	public ClientInfo getClientInfo() {
		return this.ci;
	}

	public void setClientInfo(ClientInfo ci) {
		this.ci = ci;
	}
}
