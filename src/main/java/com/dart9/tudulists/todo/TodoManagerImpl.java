package com.dart9.tudulists.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service (value = "todoManager")
public class TodoManagerImpl implements TodoManager {

    @Autowired
    private TodoDAO todoDAO;

    @Override
    public Todo getTodo(int id) {
        return null;
    }

    @Override
    public void saveTodo(Todo todo) {
        todoDAO.saveTodo(todo);
    }

    @Override
    public void updateTodo(Todo todo) {
        todoDAO.updateTodo(todo);
    }

    @Override
    public void removeTodo(Todo todo) {
        todoDAO.removeTodo(todo);
    }
}
