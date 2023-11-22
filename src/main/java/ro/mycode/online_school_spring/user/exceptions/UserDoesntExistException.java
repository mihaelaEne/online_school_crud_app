package ro.mycode.online_school_spring.user.exceptions;

import static ro.mycode.online_school_spring.system.Constants.USER_DOESNT_EXIST;

public class UserDoesntExistException extends RuntimeException{

    public UserDoesntExistException(){super(USER_DOESNT_EXIST);}
}