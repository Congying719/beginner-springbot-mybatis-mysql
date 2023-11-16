package com.demo.demoboot.mapper;

import com.demo.demoboot.entiry.Student;
import com.demo.demoboot.enums.SexEnum;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.Mapping;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> findAll();

    @Insert("INSERT INTO student(id,name) VALUES(#{id}, #{name})")
    void insert(Student user);

    @Update("UPDATE student SET id=#{id},name=#{name} WHERE id =#{id}")
    void update(Student user);

    @Delete("DELETE FROM student WHERE id =#{id}")
    void delete(int id);

    @Select("SELECT * FROM student WHERE id = #{id}")
    @Results({
            @Result(property = "name",  column = "name"),
            @Result(property = "id", column = "id")
    })
    Student getOne(int id);
}
