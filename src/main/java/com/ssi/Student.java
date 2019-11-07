package com.ssi;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.SelectBeforeUpdate;

import lombok.Data;


@Entity
@Data
@NamedQuery(name="FirstQuery",query="from Student where branch='CS'")

@NamedNativeQuery(name="test",query="select * from student")

@NamedQueries(value = { @NamedQuery(name="Student.CS",query="from Student where branch='CS'"),
		@NamedQuery(name="Student.IT",query="from Student where branch='IT'")})
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rno;
	private String name;
	private String branch;
	private int marks;
}
