package com.dart9.tudulists.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "roleManager")
@Transactional
public class RoleManagerImpl implements RoleManager {

    @Autowired
    private RoleDAO roleDAO;

    @Override
    public void createRole(Role role) {
        roleDAO.saveRole(role);
    }

    @Override
    public void deleteRole(Role role) {
        roleDAO.removeRole(role);
    }

    @Override
    public Role findRole(int id) {
        return null;
    }

    @Override
    public void updateRole(Role role) {
        roleDAO.updateRole(role);
    }

    @Override
    public RoleDAO getRoleDAO() {
        return roleDAO;
    }

    @Override
    public void setRoleDAO(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }
}
