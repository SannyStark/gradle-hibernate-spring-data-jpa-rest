package com.sanny.dao;

import com.sanny.conf.DataBaseConfig;
import com.sanny.dto.UserDTO;
import com.sanny.exceptions.UserNotFoundException;
import com.sanny.service.CRMService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * Created by sanny on 20.07.16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataBaseConfig.class)
public class UserDaoTest {

    @Autowired
    private CRMService crmService;

    private UserDTO createMockUser(){
        UserDTO user = new UserDTO();
        user.setEmail("test@email.com");
        user.setPassword("SHA-1");
        user = crmService.createUser(user);
        return user;
    }


    @Test
    public void createNewUser(){
        UserDTO mockUser = createMockUser();
        Assert.notNull(mockUser.getId());
    }

    @Test(expected = UserNotFoundException.class)
    public void removeUser(){
        UserDTO mockUser = createMockUser();
        crmService.removeUser(mockUser.getId());
        crmService.findById(mockUser.getId());
    }
}
