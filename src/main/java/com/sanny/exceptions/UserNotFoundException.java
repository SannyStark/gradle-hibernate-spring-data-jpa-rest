package com.sanny.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by sanny on 20.07.16.
 */

public class UserNotFoundException extends ErrorResource {
    public UserNotFoundException() {
        super.code = "404";
        super.message = "User Not Found Exception";
    }
}
