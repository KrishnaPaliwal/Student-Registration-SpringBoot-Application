package com.student.register.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.register.entity.Student;

public interface StudentRepository extends JpaRepository<Student, String> {
}
