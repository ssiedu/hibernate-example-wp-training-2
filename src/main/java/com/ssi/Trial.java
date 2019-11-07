package com.ssi;

import javax.persistence.FlushModeType;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;

public class Trial {

	public static void main(String[] args) {
		
		Session session=DataUtility.getSessionFactory().openSession();
		
		
		
		//session.doReturningWork(work)
		

	}

}
