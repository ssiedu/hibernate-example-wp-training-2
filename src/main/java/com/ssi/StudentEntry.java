package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentEntry {

	public static void main(String[] args) {
		SessionFactory sf1=DataUtility.getSessionFactory();
		Session session=sf1.openSession();
		Transaction tr=session.beginTransaction();
		Student s1=new Student(); s1.setName("AA"); s1.setBranch("CS"); s1.setMarks(50);
		Student s2=new Student(); s2.setName("BB"); s2.setBranch("CS"); s2.setMarks(60);
		Student s3=new Student(); s3.setName("CC"); s3.setBranch("IT"); s3.setMarks(70);
		Student s4=new Student(); s4.setName("DD"); s4.setBranch("IT"); s4.setMarks(80);
		Student s5=new Student(); s5.setName("EE"); s5.setBranch("CS"); s5.setMarks(55);
		Student s6=new Student(); s6.setName("FF"); s6.setBranch("CS"); s6.setMarks(65);
		Student s7=new Student(); s7.setName("GG"); s7.setBranch("IT"); s7.setMarks(75);
		Student s8=new Student(); s8.setName("HH"); s8.setBranch("IT"); s8.setMarks(85);
		Student s9=new Student(); s9.setName("II"); s9.setBranch("CS"); s9.setMarks(58);
		Student s10=new Student(); s10.setName("JJ"); s10.setBranch("CS"); s10.setMarks(68);
		Student s11=new Student(); s11.setName("KK"); s11.setBranch("IT"); s11.setMarks(78);
		Student s12=new Student(); s12.setName("LL"); s12.setBranch("IT"); s12.setMarks(88);
		session.save(s1); session.save(s2); session.save(s3); session.save(s4);
		session.save(s5); session.save(s6); session.save(s7); session.save(s8);
		session.save(s9); 
		session.save(s10); 
		session.save(s11); 
		session.save(s12);	
		
		tr.commit();
		session.close();
		System.out.println("DATA STORED");
		
	}

}

