package com.boot.web;


import com.boot.entity.Student;
import com.boot.service.StudentService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * Created by wl on 2017/6/13.
 */

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @ApiOperation(value="获取学生列表", notes="获取学生列表")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @ApiIgnore//使用该注解忽略这个API
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") Long id) {
        return studentService.getStudentById(id);
    }


    @ApiOperation(value = "更新学生信息", notes = "根据url的id来指定更新学生信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "学生ID", required = true, dataType = "Long", paramType = "path"),
            @ApiImplicitParam(name = "name", value = "学生姓名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "学生年龄", required = true, dataType = "int")
    })
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    public Student updateStudent(@PathVariable("id") Long id, @RequestParam(value = "name", required = true) String name,
                                 @RequestParam(value = "age", required = true) int age) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        student.setId(id);
        return studentService.updateStudent(student);
    }


    @ApiOperation(value="新增学生", notes="新增学生")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "学生姓名", required = true, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "学生年龄", required = true, dataType = "int")
    })
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Student insertStudent(@RequestParam(value = "name") String name,
                                 @RequestParam(value = "age") int age) {
        Student student = new Student();
        student.setAge(age);
        student.setName(name);
        return studentService.insertStudent(student);
    }
}


