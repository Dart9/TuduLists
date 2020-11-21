package com.dart9.tudulists.todolist;

public interface TodoListDAO {
    public TodoList getTodoList(int id);
    public void saveTodoList(TodoList todoList);
    public void updateTodoList(TodoList todoList);
    public void removeTodoList(TodoList todoList);
}
