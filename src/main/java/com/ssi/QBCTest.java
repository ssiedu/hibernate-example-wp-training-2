package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class QBCTest {

	public static void main(String[] args) throws Exception {

		Session session=DataUtility.getSessionFactory().openSession();
		Criteria cr=session.createCriteria(Student.class);
		List<Student> slist=cr.list();
		System.out.println(slist);
		List<Student> slist1=cr.list();
		System.out.println(slist1);
		
		

	}

}
