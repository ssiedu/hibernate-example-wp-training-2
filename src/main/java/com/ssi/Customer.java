package com.ssi;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import lombok.Data;

@Entity
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	//@GeneratedValue(generator="increment")
	//@SequenceGenerator(name="cust_gen",sequenceName="custcode_gen",allocationSize=1, initialValue=1001)
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cust_gen" )
	//@GeneratedValue(strategy=GenerationType.TABLE,generator="cust_gen_table" )
	//@TableGenerator(name="cust_gen_table",allocationSize=1, table="custcodetable",initialValue=501)
	private int code;
	private String cname;
	
	@ElementCollection(fetch=FetchType.EAGER)
	@JoinTable(name="cityinfo", joinColumns=@JoinColumn(name="custid"))
	//@GenericGenerator(name = "mygen", strategy="increment")
	//@CollectionId(columns = { @Column(name="address_id")}, generator = "mygen", type = @Type(type="long"))
	private List<String> cities;
	
}
