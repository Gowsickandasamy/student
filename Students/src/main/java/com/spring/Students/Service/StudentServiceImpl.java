package com.spring.Students.Service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.Students.StudentRepository.StudentRepository;
import com.spring.Students.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
    private StudentRepository studentRepository;

   
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

   
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    public Student getStudent(int id) {
    	 Optional<Student> optionalStudent = studentRepository.findById(id);

         if (optionalStudent.isPresent()) {
             return optionalStudent.get();
         } else {
             // Handle the case where the student with the given ID is not found.
             // You can throw an exception or return null, depending on your use case.
             // For now, let's return null.
             return null;
         }
    }
}
