package com.ssi;

import java.util.List;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class FetchMap {
	public static void main(String[] args) {

		try(Session session=DataUtility.getSessionFactory().openSession()){
			String hql="select new map(rno as id,name as sname) from Student";
			Query query=session.createQuery(hql);
			List<Map<Integer,String>> list=query.list();
			for(Map<Integer,String> map:list) {
				System.out.println(map);
			}
			session.close();
		}
		

	}
}
