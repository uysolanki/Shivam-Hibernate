package com.itp.ITPShivamHibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPShivamHibernate.entity.ChiefMinister;
import com.itp.ITPShivamHibernate.entity.State;

/**
 * Hello world!
 *
 */
public class AppForOneToOne 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();       //level1 cache - Session Level

    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    	
    	ChiefMinister cm1=new ChiefMinister();
    	cm1.setCmname("Fadnavis");
    	cm1.setAge(50);
    	
    	ChiefMinister cm2=new ChiefMinister();
    	cm2.setCmname("Sharma");
    	cm2.setAge(55);
    	
    	State s1=new State();
    	s1.setSname("Maharashtra");
    	s1.setCapCity("Mumbai");
    	s1.setChiefMinister(cm1);
    	
    	State s2=new State();
    	s2.setSname("Rajasthan");
    	s2.setCapCity("Jaipur");
    	s2.setChiefMinister(cm2);
    	
    	session1.save(s1);
    	session1.save(s2);
    	tx.commit();
    	
    	session1.close();
    	factory.close();
    	
    	
    	
    }
}
