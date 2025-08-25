package com.kn.hibernate;

import org.hibernate.Session;

import org.hibernate.Transaction;


import com.kn.entities.Student;

public class App {

    public static void main(String[] args) {
    	//createStudent();
    	//readstudent();
    	//updateStudent();
    	Session session=HibernateUtil.getSessionFactory().openSession();
    	Transaction txn=session.beginTransaction();
    	Student s1=new Student();
    	Student s2=new Student();
//Hibernate uses setters to set values into your objects from the database and for saving/updating them properly.
        s1.setName("Nandini");
    	s1.setEmail("nandini4e0@gmail.com");	
    	s2.setName("tej");
    	s2.setEmail("tej123@gmail.com");
    	session.persist(s1);
    	session.persist(s2);
    	txn.commit();
    	session.close();
    	System.out.println("students Craeted Successfully");
    	
    }

	public static void readstudent() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction txn=session.beginTransaction();
		Student s=session.find(Student.class,1);
		txn.commit();
		System.out.println(s);
		session.close();
	
		
	}
	
	public static void updateStudent() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction txn=session.beginTransaction();
		Student s=session.find(Student.class, 2);
		s.setEmail("tejakogara@gmail.com");
		session.merge(s);
		txn.commit();
		
		session.close();
	}
	public static void deleteStudent() {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction txn=session.beginTransaction();
		Student s=session.find(Student.class, 2);
		session.remove(s);
		txn.commit();
		session.close();
	}
    
    
    
       
}
