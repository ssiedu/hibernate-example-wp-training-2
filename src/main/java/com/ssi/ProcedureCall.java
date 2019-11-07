package com.ssi;

import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.hibernate.Session;

public class ProcedureCall {

	public static void main(String[] args) {
		
		try(Session session=DataUtility.getSessionFactory().openSession()){
			StoredProcedureQuery query=session.createStoredProcedureQuery("addstudent");
			query.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
			query.registerStoredProcedureParameter(3, Integer.class, ParameterMode.IN);
			//query.registerStoredProcedureParameter(4, Integer.class, ParameterMode.OUT);
			query.setParameter(1,"ABC");
			query.setParameter(2, "Mech");
			query.setParameter(3, 99);
			query.execute();
			//int res=(Integer)query.getOutputParameterValue(4);
			System.out.println("Completed");
			
		}
}

}
