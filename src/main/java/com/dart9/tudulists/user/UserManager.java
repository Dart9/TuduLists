package com.dart9.tudulists.user;

public interface UserManager {

    public void createUser(User user);
    public void deleteUser(User user);
    public User findUser(int id);
    public void updateUser(User user);

    public UserDAO getUserDAO();
    public void setUserDAO(UserDAO userDAO);

}
