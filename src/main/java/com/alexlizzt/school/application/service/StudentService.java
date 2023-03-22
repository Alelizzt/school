package com.alexlizzt.school.application.service;

import com.alexlizzt.school.domain.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
