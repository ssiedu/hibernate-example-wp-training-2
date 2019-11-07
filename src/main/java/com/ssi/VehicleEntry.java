package com.ssi;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class VehicleEntry {

	public static void main(String[] args) {
		
		Session session=DataUtility.getSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		Vehicle v1=new Vehicle(); v1.setVname("Unknown");
		TwoWheeler v2=new TwoWheeler(); v2.setVname("Bike"); v2.setSteeringHandle("YnkyHandle"); 
		FourWheeler v3=new FourWheeler(); v3.setVname("Car"); v3.setSteeringWheel("Power");
		//ImportedFourWheeler v4=new ImportedFourWheeler(); v4.setCountry("UK"); v4.setDuty(120); v4.setVname("SportsCar"); v4.setSteeringWheel("HPS");
		session.save(v1); session.save(v2); session.save(v3); //session.save(v4);
		tr.commit();
		session.close();
		System.out.println("Data Added");

	}

}
