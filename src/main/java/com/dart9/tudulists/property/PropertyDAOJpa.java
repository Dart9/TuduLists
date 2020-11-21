package com.dart9.tudulists.property;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("propertyDAO")
@Transactional
@Scope("singleton")
public class PropertyDAOJpa implements PropertyDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Autowired
    public PropertyDAOJpa (){
        super();
    }

    @Override
    public Property getProperty(String key) {
        return null;
    }

    @Override
    public void saveProperty(Property property) {
        sessionFactory.getCurrentSession().save(property);
    }

    @Override
    public void updateProperty(Property property) {
        sessionFactory.getCurrentSession().update(property);
    }

    @Override
    public void removeProperty(Property property) {
        sessionFactory.getCurrentSession().remove(property);
    }
}
