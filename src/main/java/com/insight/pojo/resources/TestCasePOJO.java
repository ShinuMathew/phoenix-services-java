package com.insight.pojo.resources;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TestCasePOJO {

	private int tcid;
	private String tcname;
	private String tcdesc;
	private String createdDate;
	private String modifiedDate;
	private String tcstatus;

	public TestCasePOJO() {

	}

	public TestCasePOJO(int tcid, String tcname, String tcdesc, String createdDate, String modifiedDate, String tcstatus) {
		this.tcid = tcid;
		this.tcname = tcname;
		this.tcdesc = tcdesc;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.tcstatus = tcstatus;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getTcstatus() {
		return tcstatus;
	}

	public void setTcstatus(String tcstatus) {
		this.tcstatus = tcstatus;
	}

	public int getTcid() {
		return tcid;
	}

	public void setTcid(int tcid) {
		this.tcid = tcid;
	}

	public String getTcname() {
		return tcname;
	}

	public void setTcname(String tcname) {
		this.tcname = tcname;
	}

	public String getTcdesc() {
		return tcdesc;
	}

	public void setTcdesc(String tcdesc) {
		this.tcdesc = tcdesc;
	}
	

}
