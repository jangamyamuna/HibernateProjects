package Yamuna.ManyToMany.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String courseName;

	@ManyToMany(mappedBy="courses",fetch=FetchType.EAGER)
	   private Set<Student> courses=new HashSet();

	public Course(int id, String courseName, Set<Student> courses) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courses = courses;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Set<Student> getCourses() {
		return courses;
	}

	public void setCourses(Set<Student> courses) {
		this.courses = courses;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
