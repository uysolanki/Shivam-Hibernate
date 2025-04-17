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
    	e.setEname("Rohit");
    	e.setSalary(900);
    	
    	PermanentEmployee e2=new PermanentEmployee();
    	e2.setEname("Rahul");
    	e2.setSalary(1000);
    	
    	session1.save(e); 
    	session1.save(e2); 
    	tx.commit();    	

    }
}
