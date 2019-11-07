package com.ssi;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class StudentProjection {

	public static void main(String[] args) {
		Criteria cr=DataUtility.getSessionFactory().openSession().createCriteria(Student.class);
		
		//Without Grouping
		//Projection pr1=Projections.avg("marks");
		/*Projection pr1=Projections.max("marks");
		cr.setProjection(pr1);
		//double res=(Double)cr.uniqueResult();
		int res=(Integer)cr.uniqueResult();
		System.out.println(res);*/
		
		//Withgroup by
		ProjectionList pL=Projections.projectionList();
		pL.add(Projections.groupProperty("branch"))
		.add(Projections.avg("marks"))
		.add(Projections.max("marks"));
		cr.setProjection(pL);
		List<Object[]> list=cr.list();

		for(Object values[]:list) {
			for(Object value:values) {
				System.out.println(value);
			}
			System.out.println("____________________");
		}
		
		

	}

}
