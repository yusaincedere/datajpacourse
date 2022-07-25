package com.example.datajpacourse.repository.student;

import com.example.datajpacourse.model.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}
