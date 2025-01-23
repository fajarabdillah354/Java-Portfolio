package hackerrank.ObjectOrientedDesign.service;

public interface LibraryServiceRepository {

    void addBook(String title, String author);

    void removeBook(Integer number);

    void showBookLibrary();

}
