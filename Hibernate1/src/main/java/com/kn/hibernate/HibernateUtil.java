package com.kn.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory factory;  // SessionFactory is a heavyweight object. It should be created only once per application.
	static {
		factory=new Configuration().configure().buildSessionFactory();
		//SessionFactory is a heavyweight object.
		//It should be created only once per application.
	}
	 public static SessionFactory getSessionFactory() {
	        return factory;
	        //This is a public static method to allow any other class to get the one-and-only SessionFactory.
  
           // Since it's static, we don't need to create an object of HibernateUtil.
	    }
	 

}
