package com.ssi;

import org.hibernate.Session;

public class ModifyStudent {

	public static void main(String[] args) {

		Session session=DataUtility.getSessionFactory().openSession();
		Student st=session.get(Student.class, 1);
		System.out.println(st);
		st.setName("MANOJ");
		session.beginTransaction().commit();
		session.close();

	}

}
