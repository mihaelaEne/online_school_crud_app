package ro.mycode.online_school_spring.service;

import ro.mycode.online_school_spring.course.repository.CourseRepo;

public class CourseService {

    private CourseRepo courseRepo;

    public CourseService(CourseRepo courseRepo){
        this.courseRepo=courseRepo;
    }
}
