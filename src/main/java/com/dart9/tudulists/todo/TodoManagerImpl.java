package com.dart9.tudulists.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service (value = "todoManager")
@Transactional
public class TodoManagerImpl implements TodoManager {

    @Autowired
    private TodoDAO todoDAO;

    @Override
    @Transactional (readOnly = true)
    public Todo getTodo(int id) {
        return null;
    }

    @Override
    @Transactional (propagation = Propagation.REQUIRED)
    public void saveTodo(Todo todo) {
        todoDAO.saveTodo(todo);
    }

    @Override
    @Transactional (propagation = Propagation.REQUIRED)
    public void updateTodo(Todo todo) {
        todoDAO.updateTodo(todo);
    }

    @Override
    @Transactional (propagation = Propagation.REQUIRED)
    public void removeTodo(Todo todo) {
        todoDAO.removeTodo(todo);
    }
}
