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
public class AppForCaching 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();  //level1 cache - Session Level
    	
    	PermanentEmployee employee1=session1.get(PermanentEmployee.class, 1); //query : yes
    	System.out.println("Employee 1 " +employee1);
    	
    	PermanentEmployee employee2=session1.get(PermanentEmployee.class, 1);
    	System.out.println("Employee 2 " +employee2);
    	
    	Session session2=factory.openSession();
    	PermanentEmployee employee3=session2.get(PermanentEmployee.class, 1); //query : yes
    	System.out.println("Employee 3 " +employee3);
    	
    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    }
}
