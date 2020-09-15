package org.example;

import junit.framework.TestCase;

public class HelloWorldTest extends TestCase {

    public void setUp() throws Exception {
        System.out.println("Setup");
    }

    public void tearDown() throws Exception {
        System.out.println("Tear down");
    }

    public void testTestGetName() {
        HelloWorld john = new HelloWorld("John");
        assertEquals("Joh", john.getName());
    }
}