package com.ssi;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class CriteriaQueryWhereExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try(Session session=DataUtility.getSessionFactory().openSession()){
			CriteriaBuilder builder=session.getCriteriaBuilder();
			CriteriaQuery<Product> criteriaQuery=builder.createQuery(Product.class);
			Root<Product> root=criteriaQuery.from(Product.class);
			//criteriaQuery.where(builder.equal(root.get("price"), 500));
			Query<Product> query=session.createQuery(criteriaQuery);
			List<Product> products=query.getResultList();
			for(Product product:products) {
				System.out.println(product);
			}
		}

	}
}
