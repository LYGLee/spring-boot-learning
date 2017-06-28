package com.boot.service.impl;

import com.boot.dao.StudentDao;
import com.boot.entity.Student;
import com.boot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wl on 2017/6/13.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> getStudents() {
        return studentDao.findAll();
    }

    @Override
    public Student getStudentById(Long id) {
        return studentDao.findOne(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentDao.saveAndFlush(student);
    }

    @Override
    public Student insertStudent(Student student) {
        return studentDao.save(student);
    }
}
