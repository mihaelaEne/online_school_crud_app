package ro.mycode.online_school_spring.user.exceptions;

import static ro.mycode.online_school_spring.system.Constants.USER_EXIST;

public class UserExistException extends RuntimeException{

    public UserExistException(){super(USER_EXIST);}
}