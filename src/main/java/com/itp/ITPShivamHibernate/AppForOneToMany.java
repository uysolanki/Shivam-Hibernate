package com.itp.ITPShivamHibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itp.ITPShivamHibernate.entity.Actor;
import com.itp.ITPShivamHibernate.entity.Employee;
import com.itp.ITPShivamHibernate.entity.Movie;

/**
 * Hello world!
 *
 */
public class AppForOneToMany 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure();
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();       //level1 cache - Session Level

    	Transaction tx=session1.beginTransaction();  //DML insert update delete
    	    	
    	Actor a1=new Actor();
    	a1.setAname("SRK");
    	a1.setAge(59);
    	
    	Actor a2=new Actor();
    	a2.setAname("AK");
    	a2.setAge(57);
    	
    	Actor a3=new Actor();
    	a3.setAname("DP");
    	a3.setAge(41);
    	
    	Movie m1=new Movie();
    	m1.setMname("CE");
    	m1.setRyear(2010);
    	
    	Movie m2=new Movie();
    	m2.setMname("Don");
    	m2.setRyear(2007);
    	
    	Movie m3=new Movie();
    	m3.setMname("Bajirao");
    	m3.setRyear(2018);
    	
    	Movie m4=new Movie();
    	m4.setMname("Khiladi");
    	m4.setRyear(1995);
    	
    	
    	List<Movie> srkMovies=new ArrayList();
    	 srkMovies.add(m1);
    	 srkMovies.add(m2);
    	 
    	 List<Movie> dpMovies=new ArrayList();
    	 dpMovies.add(m1);
    	 dpMovies.add(m3);
    	 
    	 List<Movie> akMovies=new ArrayList();
    	 akMovies.add(m4);
 
    	
    	a1.setPortfolio(srkMovies);
    	a3.setPortfolio(dpMovies);
    	a2.setPortfolio(akMovies);
    	
    	session1.save(a1);
    	session1.save(a2);
    	session1.save(a3);
    	
    	tx.commit();
    	
    	
    	session1.close();
    	factory.close(); 	
    }
}
