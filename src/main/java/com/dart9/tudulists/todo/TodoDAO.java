package com.dart9.tudulists.todo;

public interface TodoDAO {
    public Todo getTodo(int id);
    public void saveTodo(Todo todo);
    public void updateTodo(Todo todo);
    public void removeTodo(Todo todo);
}
