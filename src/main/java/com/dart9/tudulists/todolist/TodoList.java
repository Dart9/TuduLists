package com.dart9.tudulists.todolist;

import com.dart9.tudulists.todo.Todo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="todolist")
public class TodoList {

    @Id
    @GeneratedValue
    @Column(name="todolistId", unique = true, nullable = false)
    private int id;
    private String name;
    private String rssAllowed;
    private Date lastUpdate;

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRssAllowed() {
        return rssAllowed;
    }

    public void setRssAllowed(String rssAllowed) {
        this.rssAllowed = rssAllowed;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
