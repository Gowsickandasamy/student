package com.spring.Students.Service;

import java.util.*;

import com.spring.Students.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
    public List<Student> getAllStudents();
    public Student getStudent(int id);
}
