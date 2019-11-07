package com.ssi;

import java.io.Serializable;

import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

public class MyInterceptor extends EmptyInterceptor {

	/*@Override
	public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		// TODO Auto-generated method stub
		System.out.println("LOADING----------------------------------------------------------------->");
		System.out.println(entity);
		System.out.println("State  : ");
		for(Object obj:state) {
			System.out.println(obj);
		}
		System.out.println("Properties : ");
		for(String name:propertyNames) {
			System.out.println(name);
		}
		System.out.println("Types  : ");
		for(Type t:types) {
			System.out.println(t.getName());
		}
		
		return super.onLoad(entity, id, state, propertyNames, types);
	}*/

	@Override
	public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
		// TODO Auto-generated method stub
		
		/*Product p=(Product)entity;
		int price=(Integer)state[1];
		System.out.println("PRICE========================>"+price);
		p.setPrice(price*10);*/
		
		System.out.println("SAVING PRODUCT =========================> : ");
		System.out.println(entity);
		System.out.println("State  : ");
		for(Object obj:state) {
			System.out.println(obj);
		}
		System.out.println("Properties : ");
		for(String name:propertyNames) {
			System.out.println(name);
		}
		System.out.println("Types  : ");
		for(Type t:types) {
			System.out.println(t.getName());
		}
		System.out.println(super.onSave(entity, id, state, propertyNames, types));
		return super.onSave(entity, id, state, propertyNames, types);
		//return true;
	}

	@Override
	public String onPrepareStatement(String sql) {
		System.out.println("PREPARING  : ===============================>"+sql);
		return super.onPrepareStatement(sql);
	}


	
	
	
	
	
}
