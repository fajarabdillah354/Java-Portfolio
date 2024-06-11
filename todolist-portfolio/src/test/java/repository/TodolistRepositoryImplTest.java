package repository;

import Entity.Todolist;
import Repository.TodolistRepository;
import Repository.TodolistRepositoryImpl;
import Util.DatabaseUtil;
import com.zaxxer.hikari.HikariDataSource;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodolistRepositoryImplTest {

    private HikariDataSource dataSource;

    private TodolistRepository todolistRepository;


    @BeforeEach
    void beforeEach() {
        dataSource = DatabaseUtil.getDataSource();
        todolistRepository = new TodolistRepositoryImpl(dataSource);
    }

    @Test
    void testAdd() {
       Todolist todolist = new Todolist();
       todolist.setTodo("Ahmad");
       todolistRepository.add(todolist);
    }

    @Test
    void testRemove() {
        System.out.println(todolistRepository.remove(2));
        System.out.println(todolistRepository.remove(3));
        System.out.println(todolistRepository.remove(4));

    }


    @Test
    void testGetAll() {
        todolistRepository.add(new Todolist("fajar abdillah ahmad"));
        todolistRepository.add(new Todolist("naufalrio"));
        todolistRepository.add(new Todolist("sandiaga uno"));

        Todolist[] todolists = todolistRepository.getAll();
        for (var todo:todolists){
            System.out.println(todo.getId() +" : "+ todo.getTodo());

        }


    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
