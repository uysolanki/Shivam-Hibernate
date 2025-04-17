package com.itp.ITPShivamHibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table(name="itpEmployee")
public class PermanentEmployee //tablename = itpemployee
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrement
	private int eno;
	
	@Column(name="employeeName")
	private String ename;
	private double salary;
	
	@Transient
	private int temp;
	
	public PermanentEmployee() {}
	public PermanentEmployee(int eno, String ename, double salary) {
		this.eno = eno;
		this.ename = ename;
		this.salary = salary;
	}
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	

}
