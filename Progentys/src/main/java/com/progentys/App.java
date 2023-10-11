package com.progentys;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.progentys.entity.Student;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		/*
		 * Student student = new Student();
		 * 
		 * student.setName("radhika_Neehar"); student.setAge(21);
		 * session.persist(student);
		 */
		
		 Student student= (Student) session.get(Student.class,1);
		session.remove(student);
		
		transaction.commit();

		/*
		 * Student student=(Student) session.get(Student.class, 1); Student
		 * student1=(Student) session.get(Student.class, 2);
		 * 
		 * System.out.println(student); System.out.println(student1);
		 */

		session.close();

	}
}
