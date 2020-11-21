package com.dart9.tudulists.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "userManager")
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void createUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public void deleteUser(User user) {
        userDAO.removeUser(user);
    }

    @Override
    public User findUser(int id) {
        return userDAO.getUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDAO.updateUser(user);
    }

    public UserDAO getUserDAO() {
        System.out.println("Méthode getUserDAO de la class UserManagerImpl");
        return userDAO;
    }

    @Override
    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
}
