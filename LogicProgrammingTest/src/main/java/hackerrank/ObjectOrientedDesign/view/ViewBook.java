package hackerrank.ObjectOrientedDesign.view;

import hackerrank.ObjectOrientedDesign.service.LibraryServiceImpl;
import hackerrank.ObjectOrientedDesign.service.LibraryServiceRepository;
import hackerrank.ObjectOrientedDesign.util.InputUtil;

import java.sql.SQLOutput;

public class ViewBook {

    public LibraryServiceRepository libraryServiceRepository;

    public ViewBook(LibraryServiceRepository libraryServiceRepository) {
        this.libraryServiceRepository = libraryServiceRepository;
    }

    public void showLibraryBook(){
        while (true){

            libraryServiceRepository.showBookLibrary();
            System.out.println("BOOK : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("3. Keluar");

            String input = InputUtil.input("Pilih");

            if (input.equals("1")){
                addBook();
            } else if (input.equals("2")) {

            }

        }

    }


    public void addBook(){
        System.out.println("======== MENAMBAH BUKU ========");

        String title = InputUtil.input("Title Book, pilih(x) untuk batal ");
        String author = InputUtil.input("Author Book, pilih(x) untuk batal ");
        if (title.equals("x") || author.equals("x")){
            //batal
        }else {
            libraryServiceRepository.addBook(title, author);
        }
    }

    public void removeBook(){
        System.out.println("===== MENGHAPUS BUKU ======");
        String hapus = InputUtil.input("Pilih id Buku yang ingin dihapus, x untuk batal");
        if (hapus.equals("x")){
            //batal
        }else{
            libraryServiceRepository.removeBook(Integer.valueOf(hapus));
        }
    }


}
