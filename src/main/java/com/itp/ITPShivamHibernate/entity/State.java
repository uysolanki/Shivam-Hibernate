package com.itp.ITPShivamHibernate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class State {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sno;
	private String sname;
	private String capCity;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "cmno",referencedColumnName = "cmno")
	private ChiefMinister chiefMinister;   //chiefMinister_cmno
	
	public State() {}
	
	public State(int sno, String sname, String capCity, ChiefMinister chiefMinister) {
		this.sno = sno;
		this.sname = sname;
		this.capCity = capCity;
		this.chiefMinister = chiefMinister;
	}

	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCapCity() {
		return capCity;
	}
	public void setCapCity(String capCity) {
		this.capCity = capCity;
	}
	
	
	public ChiefMinister getChiefMinister() {
		return chiefMinister;
	}
	public void setChiefMinister(ChiefMinister chiefMinister) {
		this.chiefMinister = chiefMinister;
	}
	@Override
	public String toString() {
		return "State [sno=" + sno + ", sname=" + sname + ", capCity=" + capCity + ", chiefMinister=" + chiefMinister
				+ "]";
	}
	
	
	
	
	

}
