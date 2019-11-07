package com.ssi;

import org.hibernate.Session;

public class SearchProduct {
	public static void main(String args[]){
		Session session=DataUtility.getSessionFactory().withOptions().interceptor(new MyInterceptor()).openSession();
		Product product=session.get(Product.class, 1);
		System.out.println(product);
		session.close();
		
	}
}
