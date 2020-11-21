package com.dart9.tudulists.user;

public interface UserDAO {

    public User getUser(int id);
    public void saveUser(User user);
    public void updateUser(User user);
    public void removeUser(User user);
}
