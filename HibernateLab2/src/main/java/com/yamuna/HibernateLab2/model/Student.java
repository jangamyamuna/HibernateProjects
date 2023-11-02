package com.yamuna.HibernateLab2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")

public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="std_id")
    private int id;
	
	@Column(name="std_name")
    private String name;
	
	@Column(name="std_fee")
    private int fee;
	
	
	
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getfee() {
		return fee;
	}
	public void setfee(int fee) {
		this.fee = fee;
	}
	public Student(int id, String name, int fee) {
		super();
		this.id = id;
		this.name = name;
		this.fee = fee;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    


}
