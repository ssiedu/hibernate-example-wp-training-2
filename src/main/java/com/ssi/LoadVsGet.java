package com.ssi;

import org.hibernate.Session;

public class LoadVsGet {

	public static void main(String[] args) throws Exception {

		Session session=DataUtility.getSessionFactory().openSession();
		//Student s=session.load(Student.class, 1);
		//Student s=session.load(Student.class, 1);
		Student st1=session.get(Student.class, 1);
		System.out.println(st1);
		System.out.println("Fetching Again");
		Thread.sleep(120000);
		Student st2=session.get(Student.class, 1);
		System.out.println(st1);
		session.close();
	}

}
