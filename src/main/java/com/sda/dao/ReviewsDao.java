package com.sda.dao;

import com.sda.model.Reviews;
import com.sda.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ReviewsDao extends GenericDao <Reviews> {
    public Reviews findReviewById(Long id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            return session.find(Reviews.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

//    public void createReview(Reviews reviews) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.save(reviews);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//    }
//    public void deleteReview(Reviews reviews) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.delete(reviews);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//
//    }
//    public void updateReview(Reviews reviews) {
//        Transaction transaction = null;
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            transaction = session.beginTransaction();
//            session.update(reviews);
//            transaction.commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            if (transaction != null) {
//                transaction.rollback();
//            }
//        }
//    }
//    public Reviews findReviewById(Long id) {
//        try {
//            Session session = HibernateUtil.getSessionFactory().openSession();
//            return session.find(Reviews.class, id);
//        } catch (Exception e) {
//            e.printStackTrace();
//            return null;
//        }
//    }
//

}
