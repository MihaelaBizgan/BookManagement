package com.sda;

import com.sda.dao.AuthorDao;
import com.sda.dao.BookDao;
import com.sda.dao.ReviewsDao;
import com.sda.model.Author;
import com.sda.model.Book;
import com.sda.model.Reviews;
import com.sda.utils.HibernateUtil;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        HibernateUtil.getSessionFactory().openSession();
//        HibernateUtil.shutdown();

        AuthorDao authorDao = new AuthorDao();
//        Author author = new Author("Gabriela", "Sara");
//        authorDao.createEntity(author);
//
//        author = authorDao.findById(1L);
//        System.out.println(author);
//        //authorDao.deleteAuthor(author);


//       Author author = authorDao.findById(3l);
//       author.setFirstName("Silviu");
//       authorDao.updateAuthor(author);


        BookDao bookDao = new BookDao();
//        Book book = new Book(1, "Info systems", "Professional reading");
//        bookDao.createEntity(book);
//        System.out.println(book);
//        book = bookDao.findBookById(1L);
//        System.out.println(book);

//        bookDao.deleteEntity(book);
//        book.setTitle("Procesul");
//        bookDao.updateEntity(book);

        ReviewsDao reviewsDao = new ReviewsDao();
//Reviews reviews = new Reviews( 1L, "Nice job", 10);
//        reviewsDao.createEntity(reviews);
//        System.out.println(reviews);
//        reviews = reviewsDao.findReviewById(32L);
//        reviews.setComment("It could have been better");
//        reviewsDao.updateEntity(reviews);
//        //reviewsDao.deleteReview(reviews);

        //Author author = authorDao.findById();

//        book = bookDao.findBookById(1L);
//        //bookDao.updateEntity();
//        System.out.println(book);
//
//        BookDao bookDao = new BookDao();
//        Book book = bookDao.findBookById(36L);
        Reviews reviews = new Reviews(9, "Job done ok");
        //reviewsDao.createEntity(reviews);
        //System.out.println(reviews);
        reviews = reviewsDao.findReviewById(39L);
        reviews = reviewsDao.findReviewById(37L);
//        reviews.setBook(book);
        //reviewsDao.createEntity(reviews);
        reviewsDao.deleteEntity(reviews);


        Author author_id = authorDao.findById(35L);
        Book book = bookDao.findBookById(36L);
        book.setAuthor(author_id);
        bookDao.updateEntity(book);
        System.out.println(book);

        author_id = authorDao.findById(42L);
        Book book1 = bookDao.findBookById(4l);
        book1.setAuthor(author_id);
        bookDao.updateEntity(book1);
        System.out.println(book1);

        book1 = bookDao.findBookById(4L);
        book = bookDao.findBookById(36L);
        reviews = reviewsDao.findReviewById(38L);
        reviews = reviewsDao.findReviewById(34L);
        reviews.setBook(book1);
        reviews.setBook(book);
        reviewsDao.updateEntity(reviews);
        bookDao.updateEntity(book1);
        bookDao.updateEntity(book);
        System.out.println(book1);

//        Author author = authorDao.findById(41L);
//        book = bookDao.findBookById(2L);
//        System.out.println(author.getBookList().toString());




    }

}
