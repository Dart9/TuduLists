package com.dart9.tudulists.todolist;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository ("todoListDAO")
@Transactional
@Scope("singleton")
public class TodoListDAOJpa implements TodoListDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public TodoList getTodoList(int id) {
        return null;
    }

    @Override
    public void saveTodoList(TodoList todoList) {
    sessionFactory.getCurrentSession().save(todoList);
    }

    @Override
    public void updateTodoList(TodoList todoList) {
        sessionFactory.getCurrentSession().update(todoList);
    }

    @Override
    public void removeTodoList(TodoList todoList) {
        sessionFactory.getCurrentSession().remove(todoList);
    }
}
