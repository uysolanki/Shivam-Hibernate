package com.itp.ITPShivamHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPShivamHibernate.entity.PermanentEmployee;

/**
 * Hello world!
 *
 */
public class AppForSave 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    	
    	PermanentEmployee e=new PermanentEmployee();
    	e.setEname("Jim");
    	e.setSalary(9000);
    	session1.save(e);
    	tx.commit(); 
    	
    	PermanentEmployee employee1=session1.get(PermanentEmployee.class, 8);
    	System.out.println(employee1);
    	
    	session1.delete(employee1);
    	
    	System.out.println(employee1);
    	
    	
    	   	

    }
}
