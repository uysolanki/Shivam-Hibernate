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
public class AppForGet 
{
    public static void main( String[] args )
    {
    	Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    
    	Session session1=factory.openSession();  //session blank
    	Transaction tx=session1.beginTransaction();
    	
    	PermanentEmployee employee1=session1.get(PermanentEmployee.class, 3);  //found in session cache? No
    																			  //db queried : yes
    																			 //query displayed on console:yes
    	
    	System.out.println(employee1);											//toString
    	
    	PermanentEmployee employee2=session1.get(PermanentEmployee.class, 1);  //found in session cache? Yes
    																			//db queried : no
    																		//query displayed on console:no
    	System.out.println(employee2);									//toString
    	System.out.println(employee1==employee2);                    //true
    	
    	PermanentEmployee employee3=session1.get(PermanentEmployee.class, 1);
    	PermanentEmployee employee4=session1.get(PermanentEmployee.class, 1);
    	PermanentEmployee employee5=session1.get(PermanentEmployee.class, 1);
    	PermanentEmployee employee6=session1.get(PermanentEmployee.class, 1);
    	PermanentEmployee employee7=session1.get(PermanentEmployee.class, 1);
    	PermanentEmployee employee8=session1.get(PermanentEmployee.class, 1);
    	
    }
}
