package com.dart9.tudulists.property;

public interface PropertyDAO {
    public Property getProperty(String key);
    public void saveProperty(Property property);
    public void updateProperty(Property property);
    public void removeProperty(Property property);
}
