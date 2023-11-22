package ro.mycode.online_school_spring.user.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateCourseRequest {

    private String userName;
    private String materie;
    private int prezenteObl;
}
