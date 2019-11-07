package com.ssi;

import org.hibernate.Session;

public class CustomerSearch {

	public static void main(String[] args) {
		
		Session session=DataUtility.getSessionFactory().openSession();
		Customer c=session.get(Customer.class, 1);
		System.out.println(c.getClass().getName());
		System.out.println(c.getCode());
		System.out.println(c.getCname());
		session.close();
		System.out.println(c.getCities());
	}

}
