package org.example;

/**
 * Hello world class for demo
 * @author Feng Du
 * @version 1.0
 */
public class HelloWorld {
    /**
     * Get Name
     * @return the name
     */
    public String getName() {
        return name;
    }

    private String name;

    /**
     * Set the name
     * @param name to set
     */
    public HelloWorld(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    private String fullname;

    public HelloWorld(String name, String fullname) {
        this.name = name;
        this.fullname = fullname;
    }
}
