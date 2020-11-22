package com.dart9.tudulists.user;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository ("userDAO")
@Scope("singleton")
public class UserDAOJpa implements UserDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public UserDAOJpa (){
        super();
    }

    @Override
    public User getUser(int id) {
        return null;
    }

    @Override
    public void saveUser(User user) {
        sessionFactory.getCurrentSession().save(user);
    }

    @Override
    public void updateUser(User user) {
        sessionFactory.getCurrentSession().update(user);
    }

    @Override
    public void removeUser(User user) {
        sessionFactory.getCurrentSession().remove(user);
    }
}
