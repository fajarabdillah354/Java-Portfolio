package hackerrank.ObjectOrientedDesign.view;

import com.zaxxer.hikari.HikariDataSource;
import hackerrank.ObjectOrientedDesign.repository.LibraryRepository;
import hackerrank.ObjectOrientedDesign.repository.LibraryRepositoryImpl;
import hackerrank.ObjectOrientedDesign.service.LibraryServiceImpl;
import hackerrank.ObjectOrientedDesign.service.LibraryServiceRepository;
import hackerrank.ObjectOrientedDesign.util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;

public class LibraryApp {


    public static void main(String[] args) {
        HikariDataSource hikariDataSource = DatabaseUtil.getDataSource();
        LibraryRepository libraryRepository = new LibraryRepositoryImpl(hikariDataSource);
        LibraryServiceRepository libraryServiceRepository = new LibraryServiceImpl(libraryRepository);
        ViewBook viewBook = new ViewBook(libraryServiceRepository);

        viewBook.showLibraryBook();






    }
}
