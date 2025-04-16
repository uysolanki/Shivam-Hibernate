package com.itp.ITPShivamHibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee //tablename = employee
{
	@Id
	private int eno;
	private String ename;
	private double salary;
	
	public Employee() {}
	public Employee(int eno, String ename, double salary) {
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
