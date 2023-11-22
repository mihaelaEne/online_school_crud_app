package ro.mycode.online_school_spring.user.exceptions;

import static ro.mycode.online_school_spring.system.Constants.NO_UPDATE;

public class NoUpdate extends RuntimeException{
    public NoUpdate(){super(NO_UPDATE);}
}