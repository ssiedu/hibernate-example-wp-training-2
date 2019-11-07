package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class StudentList {

	public static void main(String[] args) {

		try(Session session=DataUtility.getSessionFactory().openSession()){
			Criteria cr=session.createCriteria(Student.class);
			List<Student> list=cr.list();
			for(Student s:list) {
				System.out.println(s.getName()+","+s.getMarks());
				s.setMarks(s.getMarks()+1);
				//session.evict(s);//expel
			}
			//session.clear();//evict all
			session.beginTransaction().commit();
		}
		

	}

}
