package com.itp.ITPShivamHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPShivamHibernate.entity.Employee;

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
    	
    	System.out.println(factory);
    	System.out.println(factory.isClosed());
    	
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    	
    	Employee e=new Employee(18,"Virat",800);
    	session1.save(e);  
    	tx.commit();
    	

    	

    }
}
