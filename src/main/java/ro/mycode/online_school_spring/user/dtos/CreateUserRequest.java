package ro.mycode.online_school_spring.user.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class CreateUserRequest {
    private String nume;
    private int varsta;
    private String username;
    private String password;
}