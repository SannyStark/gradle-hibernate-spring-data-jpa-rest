package com.sanny.dto;

import com.fasterxml.jackson.annotation.JsonView;
import com.sanny.jsonviews.Views;

import javax.persistence.Column;

/**
 * Created by sanny on 20.07.16.
 */
public class UserDTO {

    @JsonView(Views.Public.class)
    private Long id;

    @JsonView(Views.Public.class)
    private String email;

    private String password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;


    }
}
