package com.ssi;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ProductEntry {
	public static void main(String[] args) {
		SessionFactory sf1=DataUtility.getSessionFactory();
		Session session=sf1.withOptions().interceptor(new MyInterceptor()).openSession();
		Transaction tr=session.beginTransaction();
		Product p1=new Product(); p1.setPname("Mouse");p1.setPrice(100);
		/*Product p2=new Product(); p2.setPname("Kboard");p2.setPrice(200);
		Product p3=new Product(); p3.setPname("Led");p3.setPrice(300);
		Product p4=new Product(); p4.setPname("Dvd");p4.setPrice(400);
		Product p5=new Product(); p5.setPname("Hdd");p5.setPrice(500);
		session.save(p1); session.save(p2); session.save(p3); session.save(p4); session.save(p5);*/
		session.save(p1);
		tr.commit();
		
		session.close();
		System.out.println("DATA STORED");
		
	}

}
