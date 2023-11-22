package ro.mycode.online_school_spring.user.exceptions;

import static ro.mycode.online_school_spring.system.Constants.COURSE_EXIST_IN_DB;

public class CourseExistInUserDB extends RuntimeException {
    public CourseExistInUserDB(){super(COURSE_EXIST_IN_DB);}
}
