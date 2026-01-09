package com.example.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NewStudent s1 = new NewStudent();
        s1.setName("priyam");
        s1.setRollNo(30);
        s1.setAge(23);

        Configuration con = new Configuration();
        con.addAnnotatedClass(com.example.demo.NewStudent.class);
        con.configure();

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(s1);
        transaction.commit();

        System.out.println(s1);
    }
}
