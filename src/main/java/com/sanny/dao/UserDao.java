package com.sanny.dao;

import com.sanny.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by sanny on 20.07.16.
 */
public interface UserDao extends CrudRepository<User,Long> {
    List<User> findAll();
}
