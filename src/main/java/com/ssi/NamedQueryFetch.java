package com.ssi;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class NamedQueryFetch {

	public static void main(String[] args) {
		
		try(Session session=DataUtility.getSessionFactory().openSession()){
			//Query query=session.getNamedQuery("FirstQuery");
			//Query query=session.getNamedQuery("Student.CS");
			Query query=session.getNamedQuery("Student.IT");
			session.getNamedNativeQuery("test");
			List<Student> students=query.list();
			for(Student student:students) {
				System.out.println(student);
			}
		}

	}

}
