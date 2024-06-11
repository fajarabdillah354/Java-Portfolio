package Service;

import Entity.Todolist;
import Repository.TodolistRepository;

public class TodolistServiveImpl implements TodolistService {

    public TodolistRepository todolistRepository;

    public TodolistServiveImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }


    @Override
    public void showTodolist() {
        System.out.println("======= Selamat Datang di Aplikasi Todolist =======");
        Todolist[] model = todolistRepository.getAll();
        for (var todolist : model){
            System.out.println(todolist.getId()+ "." +todolist.getTodo() );
        }
    }

    @Override
    public void addTodolist(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("SUKSES MENAMBAH TODO");

    }

    @Override
    public void removeTodolist(Integer number) {
        boolean sukses = todolistRepository.remove(number);
        if (sukses){
            System.out.println("SUKSES MENGHAPUS TODO : "+number);
        }else{
            System.out.println("GAGAL MENGHAPUS TODO : "+number);
        }
    }
}
