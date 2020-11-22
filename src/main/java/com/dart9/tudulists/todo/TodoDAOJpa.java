package com.dart9.tudulists.todo;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository ("todoDAO")
@Scope("singleton")
public class TodoDAOJpa implements TodoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Todo getTodo(int id) {
        return null;
    }

    @Override
    public void saveTodo(Todo todo) {
        sessionFactory.getCurrentSession().save(todo);
    }

    @Override
    public void updateTodo(Todo todo) {
        sessionFactory.getCurrentSession().update(todo);
    }

    @Override
    public void removeTodo(Todo todo) {
        sessionFactory.getCurrentSession().remove(todo);
    }
}
