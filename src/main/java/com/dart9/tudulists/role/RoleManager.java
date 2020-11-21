package com.dart9.tudulists.role;


public interface RoleManager {
    public void createRole(Role role);
    public void deleteRole(Role role);
    public Role findRole(int id);
    public void updateRole(Role role);

    public RoleDAO getRoleDAO();
    public void setRoleDAO(RoleDAO roleDAO);
}
