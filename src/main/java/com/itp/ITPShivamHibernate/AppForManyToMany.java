package com.itp.ITPShivamHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPShivamHibernate.entity.Dept;
import com.itp.ITPShivamHibernate.entity.Employee;

/**
 * Hello world!
 *
 */
public class AppForManyToMany 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();       //level1 cache - Session Level

    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    	    	
    	Dept d1=new Dept();
    	d1.setDname("IT");
    	d1.setCity("Pune");
    	
    	
    	Dept d2=new Dept();
    	d2.setDname("Sales");
    	d2.setCity("Delhi");
    	
    	
    	Employee e1=new Employee();
    	e1.setEname("Alice");
    	e1.setSalary(800);
    	
    	Employee e2=new Employee();
    	e2.setEname("Ben");
    	e2.setSalary(900);
    	
    	Employee e3=new Employee();
    	e3.setEname("Chris");
    	e3.setSalary(1000);
    	
    	Employee e4=new Employee();
    	e4.setEname("David");
    	e4.setSalary(1100);
    	
    	List<Employee> itDeptEmp=new ArrayList();
    	itDeptEmp.add(e1);
    	itDeptEmp.add(e2);
    	d1.setEmployees(itDeptEmp);
    	
    	List<Employee> salesDeptEmp=new ArrayList();
    	salesDeptEmp.add(e3);
    	salesDeptEmp.add(e4);
    	d2.setEmployees(salesDeptEmp);
    	
    	session1.save(d1);
    	session1.save(d2);
    	
    	tx.commit();
    	
    	
    	session1.close();
    	factory.close(); 	
    }
}
