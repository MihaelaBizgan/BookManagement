package com.sda.dao;

import com.sda.model.Author;
import com.sda.model.Book;
import com.sda.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BookDao extends GenericDao <Book> {
    public Book findBookById(Long id) {
        Session session = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            return session.find(Book.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (session != null) {
                session.close();

            }
        }
//
//    public void createBook(Book book) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.save(book);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//    }
//    public void deleteBook(Book book) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.delete(book);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//
//    }
//    public void updateBook(Book book) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.update(book);
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
