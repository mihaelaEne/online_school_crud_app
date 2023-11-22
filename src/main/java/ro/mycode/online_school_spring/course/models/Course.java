package ro.mycode.online_school_spring.course.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ro.mycode.online_school_spring.user.models.User;

@Entity
@Table(name="courses")
@Data
@AllArgsConstructor
@SuperBuilder

@NoArgsConstructor
public class Course implements Comparable<Course>{

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    private long id;
    private String materie;
    private int prezenteObl;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


    @Override
    public int compareTo(Course o) {
        return 0;
    }
}
