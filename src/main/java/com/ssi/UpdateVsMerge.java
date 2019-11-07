package com.ssi;

import org.hibernate.Session;

public class UpdateVsMerge {

	public static void main(String[] args) {

		Session session1=DataUtility.getSessionFactory().openSession();
		Student s1=session1.get(Student.class, 1);
		System.out.println(s1);
		session1.close();
		s1.setMarks(65);
		Session session2=DataUtility.getSessionFactory().openSession();
		Student s2=session2.get(Student.class, 1);
		System.out.println(s2);
		//session2.update(s1);
		session2.merge(s1);
		System.out.println(s2);
		session2.beginTransaction().commit();
		session2.close();

	}

}
