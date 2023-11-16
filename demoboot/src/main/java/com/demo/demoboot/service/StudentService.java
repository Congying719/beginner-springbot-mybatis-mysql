package com.demo.demoboot.service;

import com.demo.demoboot.entiry.Student;
import com.demo.demoboot.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;
    public List<Student> findAll() {
        return studentMapper.findAll();
    }

    public void insertOne(Student student) {
        studentMapper.insert(student);
    }

    public void update(Student student) {
        studentMapper.update(student);
    }

    public void delete(int id) {
        studentMapper.delete(id);
    }

    public Student getOne(int id) {
        return studentMapper.getOne(id);
    }
}
