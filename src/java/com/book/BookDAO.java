/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.book;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author APCL-LAB-1
 */
public class BookDAO {
    public void doAdd(Book stu){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.save(stu);
        s.getTransaction().commit();
        s.close();
    }
    public void doUpdate(Book stu){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.update(stu);
        s.getTransaction().commit();
        s.close();
    }
    public void doDelete(Book stu){
        Session s = NewHibernateUtil.getSessionFactory().openSession();
        s.beginTransaction();
        s.delete(stu);
        s.getTransaction().commit();
        s.close();
    }
    
    public List<Book> findAllStudent(){
        List<Book> li = new ArrayList<Book>();
        Session s = NewHibernateUtil.getSessionFactory().openSession();
//            Query q = s.createQuery("select * from Login2");
              Query q = s.createQuery("from Book");
          //  li = s.createCriteria(Student.class).list();
              li = q.list();
            return li;
    }
}
