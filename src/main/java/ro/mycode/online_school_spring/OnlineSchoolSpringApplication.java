package ro.mycode.online_school_spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ro.mycode.online_school_spring.course.repository.CourseRepo;
import ro.mycode.online_school_spring.user.repository.UserRepo;
import ro.mycode.online_school_spring.view.View;

@SpringBootApplication
public class OnlineSchoolSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineSchoolSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(UserRepo userRepo, CourseRepo courseRepo, View view){
		return args -> {

			view.play();



		};
	}
}
