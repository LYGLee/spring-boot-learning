package com.boot.service;

import com.boot.entity.Student;

import java.util.List;

/**
 * Created by wl on 2017/6/13.
 */

public interface StudentService {
    List<Student> getStudents();

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    Student insertStudent(Student student);
}
