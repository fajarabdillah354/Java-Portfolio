package Repository;

import Entity.Todolist;

public interface TodolistRepository {


    Todolist[] getAll();

    void add(Todolist todolist);

    boolean remove(Integer number);

}
