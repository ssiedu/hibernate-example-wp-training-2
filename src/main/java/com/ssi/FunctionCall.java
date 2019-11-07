package com.ssi;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.Session;
import org.hibernate.jdbc.ReturningWork;

public class FunctionCall {
public static void main(String[] args) {
		
		try(Session session=DataUtility.getSessionFactory().openSession()){
			
			
			
			String s=session.doReturningWork(new ReturningWork<String>() {

				@Override
				public String execute(Connection connection) throws SQLException {
					String res="OK";
					try {
					CallableStatement cs=connection.prepareCall("{?=call getGrade(?)}");
					cs.registerOutParameter(1, Types.VARCHAR);
					cs.setInt(2, 11);
					cs.execute();
					res=cs.getString(1);
					}catch(Exception ex) {
						ex.printStackTrace();
						
					}
					return res;
				}
			});
			
			System.out.println(s);
}
}
}
