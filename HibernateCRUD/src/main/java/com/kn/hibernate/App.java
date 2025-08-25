package com.kn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.kn.entities.College;


public class App {

	public static void main(String[] args) {
		//createStudent();
		//readStudent();
		//updateStudent();
		//deleteStudent();
	}
   
      /* public static void createStudent() {
	
		Configuration conf=new Configuration().configure();
		SessionFactory factory=conf.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn= session.beginTransaction();
        College c1=new College(1,"Nandini","Nimmanapalli","Nandini@11","female","Rayachoty","19-08-2002");
		
		College c2=new College(2,"Teja","Kogara","teja@18","female","Madanapalli","18-01-2002");
		
		session.persist(c1);
		session.persist(c2);
		
		
		txn.commit();
		System.out.println("Students created successfully.");
		}*/
		
		/*public  static void readStudent() {
			Configuration conf=new Configuration().configure();
			SessionFactory factory=conf.buildSessionFactory();
			Session session =factory.openSession();
			Transaction txn=session.beginTransaction();
			College clg=session.find(College.class,1);
			txn.commit();
			System.out.println("Reading Student :"+clg);
		}*/
		
	  /*  public static void deleteStudent() {
	    	Configuration conf=new Configuration().configure();
			SessionFactory factory=conf.buildSessionFactory();
			Session session =factory.openSession();
			Transaction txn=session.beginTransaction();
			College clg=session.find(College.class, 2);
			session.remove(clg);
			
			txn.commit();
			 System.out.println("Student deleted successfully.");
			
		}
		*/
	    
		   public static void updateStudent() {
			   Configuration conf=new Configuration().configure();
				SessionFactory factory=conf.buildSessionFactory();
				Session session =factory.openSession();
				Transaction txn=session.beginTransaction();
				College clg=session.find(College.class,2);
				if (clg == null) {
			        System.out.println("No student found with ID 3 to update.");
			    } else {
			        clg.setUsername("Teja@22");
			        session.merge(clg);
			        System.out.println("Student with ID 3 updated.");
			    }
			txn.commit();
		}


		
		
		

	}


