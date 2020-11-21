package com.dart9.tudulists.property;

import javax.persistence.*;

@Entity
@Table(name = "property")
public class Property {

    @Id
    private String key;

    private String value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
