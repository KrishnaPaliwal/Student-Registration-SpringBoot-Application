package com.student.register.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.register.entity.Student;
import com.student.register.repository.StudentRepository;
import com.student.register.service.StudentService;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentByEmail(String email) {
        Optional<Student> student = studentRepository.findById(email);
        return student.orElse(null);
    }

    @Override
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student updateStudent(String email, Student updatedStudent) {
        Student existingStudent = getStudentByEmail(email);

        if (existingStudent != null) {
            // Update fields as needed
            existingStudent.setFirstName(updatedStudent.getFirstName());
            existingStudent.setLastName(updatedStudent.getLastName());
            existingStudent.setAge(updatedStudent.getAge());
            existingStudent.setSex(updatedStudent.getSex());
            existingStudent.setAddress(updatedStudent.getAddress());

            return studentRepository.save(existingStudent);
        } else {
            return null; // Student not found
        }
    }

    @Override
    public void deleteStudent(String email) {
        studentRepository.deleteById(email);
    }
}
