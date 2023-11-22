package ro.mycode.online_school_spring.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ro.mycode.online_school_spring.course.models.Course;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {

    @Query("SELECT DISTINCT c.materie FROM Course c")
    List<String> getAllUserNames();


    @Query("select c from Course c where c.materie= ?1 and c.prezenteObl= ?2")
    Optional<Course> findCourseByMaterieAndPrezenteObl(String materie, int prezenteObl);

    @Query("select c from Course c where c.materie= ?1 ")
    Optional<Course>findCourseByMaterie(String materie);


    @Modifying
    @Query("update Course c set c.prezenteObl= ?2 where c.materie= ?1")
    void updateCourse(String materie, int prezenteObl);

}
