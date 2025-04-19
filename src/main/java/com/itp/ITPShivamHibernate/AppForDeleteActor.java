package com.itp.ITPShivamHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPShivamHibernate.entity.Actor;

/**
 * Hello world!
 *
 */
public class AppForDeleteActor 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();       //level1 cache - Session Level

    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    	    	
    	Actor a1=session1.get(Actor.class,2);
    	session1.delete(a1);
    	tx.commit();
    	System.out.println("Actor Deleted");
    	
    	session1.close();
    	factory.close(); 	
    }
}
