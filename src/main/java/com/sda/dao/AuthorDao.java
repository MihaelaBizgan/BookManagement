package com.sda.dao;

import com.sda.model.Author;
import com.sda.utils.HibernateUtil;
import org.hibernate.Session;

public class AuthorDao extends GenericDao <Author> {
    public Author findById(Long id) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            return session.find(Author.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();

            }
        }
        // Asa cream un author in baza de date:
//    public void createAuthor(Author author) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.save(author);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//
//    }
//
//    // Asa stergem un author din baza de date:
//    public void deleteAuthor(Author author) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.delete(author);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//
//    }
//
//    public void updateAuthor(Author author) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.update(author);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//    }
    }
}
