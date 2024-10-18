package ru.uvuk.pp311.PP311.service;

import ru.uvuk.pp311.PP311.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.uvuk.pp311.PP311.dao.UserDao;


import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public void update(User user) {
      userDao.update(user);
   }

   @Transactional
   @Override
   public void delete(Long id) {
      userDao.delete(id);
   }

   @Override
   public List<User> findAll() {
      return userDao.findAll();
   }

   @Override
   public User findById(Long id) {
      return userDao.findById(id);
   }
}
