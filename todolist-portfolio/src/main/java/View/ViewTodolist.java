package View;

import Service.TodolistService;
import Util.InputUtil;

public class ViewTodolist {

    private TodolistService todolistService;

    public ViewTodolist(TodolistService todolistService) {
        this.todolistService = todolistService;
    }

    public void showTodolist(){
        while (true){
            todolistService.showTodolist();


            System.out.println("MENU : ");
            System.out.println("1. TAMBAH");
            System.out.println("2. HAPUS");
            System.out.println("X. KELUAR");

            var input = InputUtil.input("PILIH");

            if (input.equals("1")){
                addTodolist();
            } else if (input.equals("2")) {
                removeTodolist();
            } else if (input.equals("x") || input.equals("X")) {
                System.out.println("============= Program selesai Terimakasih ============");
                System.exit(0);
            } else {
                System.out.println("perintah tidak dikenali");
            }


        }
    }

    public void addTodolist(){
        System.out.println("Menambah TODOLIST");

        var tambah = InputUtil.input("Pilih(X) jika batal ");
        if (tambah.equals("x")){
            //batal
        }else {
            todolistService.addTodolist(tambah);
        }


    }

    public void removeTodolist(){
        System.out.println("Menghapus Todolist : ");
        var hapus = InputUtil.input("Pilih(x) jika batal ");
        if (hapus.equals("x")){
            //batal
        }else{
            todolistService.removeTodolist(Integer.valueOf(hapus));
        }
    }


}
