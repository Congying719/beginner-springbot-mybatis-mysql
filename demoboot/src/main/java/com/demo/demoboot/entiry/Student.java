package com.demo.demoboot.entiry;

public class Student {

    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student(int id, String name) {
        this.name = name;
        this.id = id;
    }
}
