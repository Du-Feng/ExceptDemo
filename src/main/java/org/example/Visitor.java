package org.example;

public class Visitor {
    private  String name;

    public String getName() {
        return name;
    }

    public Visitor(String name) {
        this.name = name;
    }

    private String fullname;

    public String getFullname() {
        return fullname;
    }
}
