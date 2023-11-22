package ro.mycode.online_school_spring.user.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;
import ro.mycode.online_school_spring.course.models.Course;


import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="users")
@Data
@AllArgsConstructor
@SuperBuilder
@NoArgsConstructor
public class User implements Comparable<User> {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;
    private String nume;
    private int varsta;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Course> courses = new ArrayList<>();




    public void addCourse(Course course){

        this.courses.add(course);

        course.setUser(this);

    }

    public void deleteCourse(Course course){
        if(this.courses.contains(course)){
            this.courses.remove(course);
            course.setUser(null);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", username='" + username + '\'' +
                ", password='" + password +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }
}