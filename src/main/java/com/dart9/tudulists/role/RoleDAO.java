package com.dart9.tudulists.role;

public interface RoleDAO {
    public Role getRole(int id);
    public void saveRole(Role role);
    public void updateRole(Role role);
    public void removeRole(Role role);
}
