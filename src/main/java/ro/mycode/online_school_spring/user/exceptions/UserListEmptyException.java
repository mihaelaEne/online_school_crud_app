package ro.mycode.online_school_spring.user.exceptions;

import static ro.mycode.online_school_spring.system.Constants.USERS_LIST_EMPTY;

public class UserListEmptyException extends RuntimeException {


    public UserListEmptyException() {
        super(USERS_LIST_EMPTY);
    }
}