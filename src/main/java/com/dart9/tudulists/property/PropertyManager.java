package com.dart9.tudulists.property;

public interface PropertyManager {

    public void createProperty(Property property);
    public void deleteProperty(Property property);
    public Property findProperty(String key);
    public void updateProperty(Property property);

    public PropertyDAO getPropertyDAO();
    public void setPropertyDAO(PropertyDAO propertyDAO);

}
