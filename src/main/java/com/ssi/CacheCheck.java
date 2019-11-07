package com.ssi;

import org.hibernate.Session;

public class CacheCheck {

	public static void main(String[] args) throws Exception {

		try(Session session=DataUtility.getSessionFactory().openSession()){
			Product p1=session.get(Product.class, 1);
			System.out.println(p1);
			Thread.sleep(30000);
			//session.refresh(p1);
			//session.evict(p1);
			//session.clear();

			Product p2=session.get(Product.class, 1);
			System.out.println(p2);
			
		}

	}

}
