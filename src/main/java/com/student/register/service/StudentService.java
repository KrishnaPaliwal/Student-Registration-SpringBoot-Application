package com.student.register.service;

import java.util.List;

import com.student.register.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student getStudentByEmail(String email);
    Student createStudent(Student student);
    Student updateStudent(String email, Student updatedStudent);
    void deleteStudent(String email);
}
