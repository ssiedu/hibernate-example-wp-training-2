package com.ssi;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class FlushModesExamples {

	public static void main(String[] args) {
		SessionFactory sf1=DataUtility.getSessionFactory();
		Session session=sf1.openSession();
		session.setHibernateFlushMode(FlushMode.MANUAL);
		Transaction tr=session.beginTransaction();
		Product p1=new Product(); p1.setPname("XYZ");p1.setPrice(100);
		session.save(p1);
		System.out.println(session.createQuery("SELECT count(*) FROM Product").uniqueResult());
		tr.commit();
	
		session.close();
		System.out.println("DATA STORED");

	}

}
