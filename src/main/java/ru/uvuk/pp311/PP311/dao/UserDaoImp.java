package ru.uvuk.pp311.PP311.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import ru.uvuk.pp311.PP311.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager entityManager;

   @Override
   public void add(User user) {
      entityManager.persist(user);
   }

   @Override
   public void update(User user) {
      entityManager.merge(user);
   }

   @Override
   public void delete(Long id) {
      entityManager.remove(findById(id));
   }

   @Override
   public User findById(Long id) {
      return entityManager.find(User.class,id);
   }

   @Override
   public List<User> findAll() {
      return entityManager.createQuery("SELECT u FROM User u", User.class).getResultList();
   }
}
