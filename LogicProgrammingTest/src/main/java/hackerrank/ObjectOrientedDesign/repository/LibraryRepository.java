package hackerrank.ObjectOrientedDesign.repository;

import hackerrank.ObjectOrientedDesign.entity.Book;

public interface LibraryRepository {

    Book[] findAllBook();


    void addBook(Book book);

    boolean removeBook(Integer number);


}
