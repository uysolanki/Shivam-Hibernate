package com.itp.ITPShivamHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPShivamHibernate.entity.Dept;
import com.itp.ITPShivamHibernate.entity.PermanentEmployee;

/**
 * Hello world!
 *
 */
public class AppDeptEager 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession(); 
    	Transaction tx=session1.beginTransaction();
    	
    	Dept d1=session1.get(Dept.class, 1);    																																	
    	
    	System.out.println(d1.getEmployees().get(0).getEname());										
    	
    	    	
    }
}
