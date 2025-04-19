package com.itp.ITPShivamHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPShivamHibernate.entity.PermanentEmployee;
import com.itp.ITPShivamHibernate.entity.TempEmp;

/**
 * Hello world!
 *
 */
public class AppObjectState 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();
    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    	
    	TempEmp e=new TempEmp();
    	e.setEno(23);
    	e.setEname("Jim");
    																	//state 1 : Transient 
    	
    	session1.save(e);												//state 2 : Persistant  
    	tx.commit();
    	
    	TempEmp pe1= session1.get(TempEmp.class, 23);
    	
    	System.out.println("First Display " +pe1);
    	
    	session1.clear();
    	
    	TempEmp pe2= session1.get(TempEmp.class, 23);
    	System.out.println("Second Display "+pe2);  
    	
    	session1.delete(pe2);
    	
    	TempEmp pe3= session1.get(TempEmp.class, 23);
    	System.out.println("Third Display "+pe2);  
    	

    }
}
