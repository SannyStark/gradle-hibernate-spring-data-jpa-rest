package com.sanny.service;

import com.sanny.dto.UserDTO;
import com.sanny.entity.User;

import java.util.List;

/**
 * Created by sanny on 20.07.16.
 */
public interface CRMService {
    UserDTO createUser(UserDTO user);
    List<UserDTO> listUsers();
    UserDTO findById(Long id);
    void removeUser(Long id);
}
