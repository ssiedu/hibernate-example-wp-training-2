package com.ssi;

import org.hibernate.Session;

public class SearchVehicle {

	public static void main(String[] args) {
		Session session=DataUtility.getSessionFactory().openSession();
		ImportedFourWheeler v1=session.get(ImportedFourWheeler.class,4);
		System.out.println(v1.getClass().getName());
		System.out.println(v1);
		session.close();
	}

}
