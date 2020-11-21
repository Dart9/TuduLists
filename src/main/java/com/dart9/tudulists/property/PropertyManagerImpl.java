package com.dart9.tudulists.property;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "propertyManager")
public class PropertyManagerImpl implements PropertyManager {

    @Autowired
    private PropertyDAO propertyDAO;

    @Override
    public void createProperty(Property property) {
        propertyDAO.saveProperty(property);
    }

    @Override
    public void deleteProperty(Property property) {
        propertyDAO.removeProperty(property);
    }

    @Override
    public Property findProperty(String key) {
        return propertyDAO.getProperty(key);
    }

    @Override
    public void updateProperty(Property property) {
        propertyDAO.updateProperty(property);
    }

    public PropertyDAO getPropertyDAO() {
        return propertyDAO;
    }

    @Override
    public void setPropertyDAO(PropertyDAO propertyDAO) {
        this.propertyDAO = propertyDAO;
    }
}
