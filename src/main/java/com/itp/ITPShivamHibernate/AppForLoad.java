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
public class AppForLoad 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();  //session blank
    	Transaction tx=session1.beginTransaction();
    	
    	PermanentEmployee employee1=session1.load(PermanentEmployee.class, 3);  //found in session cache? No
    																			//db queried :No
    														//create proxy object with id attribute and rest default value
    																			//query displayed on console:No
    	
    	System.out.println("Employee Number : " +employee1.getEno());				//	output Employee Number 1 
    																//db queried :No
    	
    	System.err.println("FSD");											//output FSD
    	
    	System.out.println("Employee Salary : " +employee1.getSalary());					//sql query will show on console
    														//Employee Salary :900
    }
}
