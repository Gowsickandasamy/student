package com.spring.Students.StudentRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.Students.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
