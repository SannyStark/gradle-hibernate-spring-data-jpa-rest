package com.sanny.rest;

import com.fasterxml.jackson.annotation.JsonView;
import com.sanny.dto.UserDTO;
import com.sanny.jsonviews.Views;
import com.sanny.service.CRMService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sanny on 20.07.16.
 */

@RestController
public class UserController {

    @Autowired
    private CRMService crmService;

    @RequestMapping("/user/{id}")
    @JsonView(Views.Public.class)
    public UserDTO user(@PathVariable("id") Long id) {
        UserDTO user = crmService.findById(id);
        return user;
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @JsonView(Views.Public.class)
    public UserDTO user(@RequestBody UserDTO user) {
        return crmService.createUser(user);
    }

}
