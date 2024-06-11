package View;

import Repository.TodolistRepository;
import Repository.TodolistRepositoryImpl;
import Service.TodolistService;
import Service.TodolistServiveImpl;
import Util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;

public class ApkTodolist {

    public static void main(String[] args) {
        HikariDataSource dataSource = DatabaseUtil.getDataSource();
        TodolistRepository todolistRepository = new TodolistRepositoryImpl(dataSource);
        TodolistService todolistService = new TodolistServiveImpl(todolistRepository);
        ViewTodolist viewTodolist = new ViewTodolist(todolistService);

        viewTodolist.showTodolist();
    }


}
