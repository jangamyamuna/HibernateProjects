package Yamuna.ManyToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Yamuna.ManyToMany.model.Course;
import Yamuna.ManyToMany.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     SessionFactory factory=cfg.buildSessionFactory();
	     Session session=factory.openSession();
	     try 
	     {
	    	Student s1=new Student();
	    	s1.setName("John");
	    	Student s2=new Student();
	    	s2.setName("Peter");
	    	Student s3=new Student();
	    	s3.setName("Emma");
	    	
	    	Course c1=new Course();
	    	c1.setCourseName("C++");
	    	Course c2=new Course();
	    	c2.setCourseName("Java");
	    	Course c3=new Course();
	    	c3.setCourseName("Python");
	    	
	    	s1.getCourses().add(c1);
	    	s2.getCourses().add(c1);
	    	s2.getCourses().add(c2);
	    	s3.getCourses().add(c3);
	    	s3.getCourses().add(c2);
	     	
	     	session.beginTransaction();
	     	session.save(s1);
	     	session.save(s2);
	     	session.save(s3);
	     	session.save(c1);
	     	session.save(c2);
	     	session.save(c3);
	     	session.getTransaction().commit();	

	     }
	     catch(Exception e)
	     {
	     	e.printStackTrace();
	     }
	     finally 
	     {
	     	session.close();
	     	factory.close();
	     }
	    
	 }

}
