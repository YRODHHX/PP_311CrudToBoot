package ru.uvuk.pp311.PP311.service;


import ru.uvuk.pp311.PP311.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    void update(User user);
    void delete(Long id);
    List<User> findAll();
    User findById(Long id);
}
