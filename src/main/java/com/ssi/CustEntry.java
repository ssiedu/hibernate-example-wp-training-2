package com.ssi;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class CustEntry {
	public static void main(String[] args) {
		SessionFactory sf1=DataUtility.getSessionFactory();
		Session session=sf1.openSession();
		Transaction tr=session.beginTransaction();
		List<String> list1=Arrays.asList("Indore","Bhopal");
		List<String> list2=Arrays.asList("Delhi","Mumbai");
		Customer c1=new Customer();c1.setCname("Amit"); c1.setCities(list1);
		Customer c2=new Customer();c2.setCname("Raj"); c2.setCities(list2);
		session.save(c1); session.save(c2);
		tr.commit();
		
		session.close();
		System.out.println("DATA STORED");
		
	}

}
