package com.dart9.tudulists.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "todoListManager")
public class TodoListManagerImpl implements TodoListDAO {

    @Autowired
    private TodoListDAO todoListDAO;

    @Override
    public TodoList getTodoList(int id) {
        return null;
    }

    @Override
    public void saveTodoList(TodoList todoList) {
        todoListDAO.saveTodoList(todoList);
    }

    @Override
    public void updateTodoList(TodoList todoList) {
        todoListDAO.updateTodoList(todoList);
    }

    @Override
    public void removeTodoList(TodoList todoList) {
        todoListDAO.removeTodoList(todoList);
    }
}
