package com.oop.mahadi.d1.Model;

import java.io.Serializable;

public class Person implements Serializable {
    String name;
    int id;
    String password;

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", password='" + password + '\'' +
                '}';
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String name, int id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
    }
}
