package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class PaginationExample {
	public static void main(String[] args) {

		try(Session session=DataUtility.getSessionFactory().openSession()){
			Criteria cr=session.createCriteria(Student.class);
			cr.setFirstResult(3);
			cr.setMaxResults(4);
			List<Student> list=cr.list();
			for(Student s:list) {
			System.out.println(s);	
			}
			System.out.println("some more");
			cr.setFirstResult(8);
			cr.setMaxResults(5);
			List<Student> list1=cr.list();
			for(Student s:list1) {
			System.out.println(s);	
			}
			session.beginTransaction().commit();
		}
		

	}
}
