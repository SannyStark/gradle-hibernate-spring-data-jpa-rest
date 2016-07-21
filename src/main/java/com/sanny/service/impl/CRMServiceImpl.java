package com.sanny.service.impl;

import com.sanny.dao.UserDao;
import com.sanny.dto.UserDTO;
import com.sanny.entity.User;
import com.sanny.exceptions.UserNotFoundException;
import com.sanny.service.CRMService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by sanny on 20.07.16.
 */
@Service
@Transactional
public class CRMServiceImpl implements CRMService {

    @Autowired
    private UserDao userDao;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO createUser(UserDTO user) {
        System.out.println(convertToEntity(user).getEmail());
        return  convertToDto(userDao.save(convertToEntity(user)));
    }

    @Override
    public List<UserDTO> listUsers() {
        List<User> all = userDao.findAll();
        List<UserDTO> collect = all.stream().map(entity -> convertToDto(entity)).collect(Collectors.toList());
        return collect;
    }

    @Override
    public UserDTO findById(Long id) {
        User user = userDao.findOne(id);
        if(user == null){
            throw new UserNotFoundException();
        }
        return convertToDto(user);
    }

    @Override
    public void removeUser(Long id) {
        userDao.delete(id);
    }

    private UserDTO convertToDto(User user) {
        UserDTO dto = modelMapper.map(user, UserDTO.class);
        return dto;
    }

    private User convertToEntity(UserDTO dto) {
        User user = modelMapper.map(dto, User.class);
        return user;
    }
}
