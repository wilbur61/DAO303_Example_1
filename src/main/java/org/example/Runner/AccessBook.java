package org.example.Runner;

 //??       import javaa.awt.print.Book;
import org.example.Controller.BookDaoImpl;
import org.example.DAOinterface.BookDao;
import org.example.model.Books;

import java.util.ArrayList;

public class AccessBook {
    public static void main(String[] args) {
        System.out.println( "############# show list of all books ########## ");
        BookDao bookDao = new BookDaoImpl();
        for (Books b : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + b.getIsbn() +" and Book Name : " + b.getBookName() );
        }
        System.out.println("--------- After added/ inserted new book ----------");
        Books b1 = new Books();
        b1.setIsbn(4);
        b1.setBookName("SQL Book");
        bookDao.saveBook(b1);

        for (Books b : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + b.getIsbn() +" and Book Name : " + b.getBookName() );
        }
        System.out.println("--------- After update book name ----------");
        Books bookupdate = bookDao.getAllBooks().get(1);
        bookupdate.setBookName("Algorithms Book");

        for (Books b : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + b.getIsbn() +" and Book Name : " + b.getBookName() );
        }
    }
}
