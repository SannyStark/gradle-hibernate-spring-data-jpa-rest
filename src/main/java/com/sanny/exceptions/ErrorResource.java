package com.sanny.exceptions;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by sanny on 20.07.16.
 */
public class ErrorResource extends RuntimeException {

    protected String code="404";

    protected String message="Resource Not Found";

    public ExceptionBody body(){
       return new ExceptionBody(this.code,this.message);
    }

    public static class ExceptionBody {
        private  String code;

        private String message;

        public ExceptionBody(String code, String message) {
            this.code = code;
            this.message = message;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}
