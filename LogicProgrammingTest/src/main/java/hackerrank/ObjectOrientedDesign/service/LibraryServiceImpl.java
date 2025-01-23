package hackerrank.ObjectOrientedDesign.service;

import hackerrank.ObjectOrientedDesign.entity.Book;
import hackerrank.ObjectOrientedDesign.repository.LibraryRepository;


public class LibraryServiceImpl implements LibraryServiceRepository{

    public LibraryRepository libraryRepository;

    public LibraryServiceImpl(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;
    }

    @Override
    public void addBook(String title, String author) {
        Book book = new Book(title, author);
        libraryRepository.addBook(book);
        System.out.println("SUKSES MENAMBAH BUKU");
    }

    @Override
    public void removeBook(Integer number) {
        boolean sukses = libraryRepository.removeBook(number);
        if (sukses){
            System.out.println("SUKSES MENGHAPUS BOOK : "+ number);
        }else {
            System.out.println("GAGAL MENGHAPUS BOOK : "+ number);
        }
    }

    @Override
    public void showBookLibrary() {

        System.out.println("SELAMAT DATANG DI SISTEM PERPUSTAKAAN");
        Book[] books = libraryRepository.findAllBook();
        for (Book book : books){
            System.out.println(book.getId()+". "+book.getTitle()+", "+book.getAuthor());
        }
    }
}
