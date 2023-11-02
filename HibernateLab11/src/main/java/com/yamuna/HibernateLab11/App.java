package com.yamuna.HibernateLab11;

/**
 * Hello world!
 *
 */
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Connection started");
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
        
        System.out.println(factory);
    }
}
