package ru.uvuk.pp311.PP311.dao;


import ru.uvuk.pp311.PP311.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   void update(User user);
   void delete(Long id);
   User findById(Long id);
   List<User> findAll();
}

