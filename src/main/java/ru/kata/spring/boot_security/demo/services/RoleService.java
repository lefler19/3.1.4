package ru.kata.spring.boot_security.demo.services;
import ru.kata.spring.boot_security.demo.entities.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllUsers();
    void save(Role role);

    void deleteById(Integer id);

    Role showUserById(Integer id);

}
