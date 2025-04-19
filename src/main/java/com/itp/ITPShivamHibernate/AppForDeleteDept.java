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
public class AppForDeleteDept 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();       //level1 cache - Session Level

    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    	    	
    	Dept d1=session1.get(Dept.class,1);
    	session1.delete(d1);
    	tx.commit();
    	System.out.println("Dept Deleted");
    	
    	session1.close();
    	factory.close(); 	
    }
}
