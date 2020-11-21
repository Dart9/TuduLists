package com.dart9.tudulists.role;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository ("roleDAO")
@Transactional
@Scope("singleton")
public class RoleDAOJpa implements RoleDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Role getRole(int id) {
        return null;
    }

    @Override
    public void saveRole(Role role) {
        sessionFactory.getCurrentSession().save(role);
    }

    @Override
    public void updateRole(Role role) {
        sessionFactory.getCurrentSession().update(role);
    }

    @Override
    public void removeRole(Role role) {
        sessionFactory.getCurrentSession().remove(role);
    }
}
