package com.sanny.dao;

import com.sanny.entity.User;
import org.springframework.data.repository.CrudRepository;


/**
 * Created by sanny on 20.07.16.
 */
public interface UserDao extends CrudRepository<User,Long> {

}
