package com.yamuna.HibernateLab2;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.yamuna.HibernateLab2.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args)
	{
	  Configuration cfg=new Configuration();
      cfg.configure("Lab2.cfg.xml");
      SessionFactory factory=cfg.buildSessionFactory();
      Session session=factory.openSession();
      try 
      {
      	
      	Student s1=new Student();
      	s1.setName("ravi");
      	s1.setfee(12000);
      	session.beginTransaction();
      	session.save(s1);
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
