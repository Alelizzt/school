package com.alexlizzt.school.service;

import com.alexlizzt.school.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
