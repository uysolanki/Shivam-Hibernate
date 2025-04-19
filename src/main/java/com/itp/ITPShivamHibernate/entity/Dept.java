package com.itp.ITPShivamHibernate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dept {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dno;
	private String dname;
	private String city;
	
	@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "dno",referencedColumnName = "dno")
	List<Employee> employees;
	
	public Dept() {}

	public Dept(int dno, String dname, String city, List<Employee> employees) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.city = city;
		this.employees = employees;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return "Dept [dno=" + dno + ", dname=" + dname + ", city=" + city + ", employees=" + employees + "]";
	}
	
	

}
