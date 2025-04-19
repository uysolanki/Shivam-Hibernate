package com.itp.ITPShivamHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TempEmp {

	@Id
	private int eno;
	private String ename;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public TempEmp() {}
	public TempEmp(int eno, String ename) {
		super();
		this.eno = eno;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "TempEmp [eno=" + eno + ", ename=" + ename + "]";
	}
	
	
	
	
}
