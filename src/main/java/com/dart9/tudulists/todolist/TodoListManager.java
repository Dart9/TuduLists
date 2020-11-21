package com.dart9.tudulists.todolist;

public interface TodoListManager {
    public void createTodoList(TodoList user);
    public void deleteTodoList(TodoList user);
    public TodoList findTodoList(int id);
    public void updateTodolist(TodoList user);

    public TodoListDAO getTodoListDAO();
    public void setTodoListDAO(TodoListDAO userDAO);
}
