package com.demo.demoboot.controller;

import com.demo.demoboot.entiry.Student;
import com.demo.demoboot.mapper.StudentMapper;
import com.demo.demoboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/abc")
    public String getName() {
        return "Monica";
    }

    @RequestMapping("/student")
    public Student getStudent() {
        return new Student(1,"Monica");
    }

    @RequestMapping("/allStudent")
    public List<Student> getAllStudent() {
        return studentService.findAll();
    }

    @RequestMapping("/insert")
    public void insert() {
        studentService.insertOne(new Student(4,"stu4"));
    }

    @RequestMapping("/update")
    public void update() {
        studentService.update(new Student(4,"update"));
    }

    @RequestMapping("/delete")
    public void delete() {
        studentService.delete(4);
    }

    @RequestMapping("/search")
    public Student getOne() {
        return studentService.getOne(1);
    }

}
