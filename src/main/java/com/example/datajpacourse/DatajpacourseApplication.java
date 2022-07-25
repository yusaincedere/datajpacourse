package com.example.datajpacourse;

import com.example.datajpacourse.model.student.Student;
import com.example.datajpacourse.repository.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatajpacourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatajpacourseApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(StudentRepository studentRepository){
		return args -> {
			Student yusa = new Student(
					"yuşa",
					"incedere",
					"yusa@gmail.com",
					24
			);
			studentRepository.save(yusa);
		};
	}
}
