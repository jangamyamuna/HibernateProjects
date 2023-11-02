package Yamuna.ManyToMany.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.*;



@Entity
public class Student 
{
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)

	 private int id;
	   
	   private String name;
	   
	   @ManyToMany(fetch=FetchType.EAGER)
	   @JoinTable(name="student_course",joinColumns=@JoinColumn(name="student_id"),
	   inverseJoinColumns=@JoinColumn(name="course_id"))
	   private Set<Course> courses=new HashSet();


	

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
	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Student(int id, String name, Set<Course> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
