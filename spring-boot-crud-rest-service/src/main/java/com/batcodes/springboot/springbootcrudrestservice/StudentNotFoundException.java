package com.batcodes.springboot.springbootcrudrestservice;

public class StudentNotFoundException extends RuntimeException {
    public StudentNotFoundException(String message) {
        super(message);
    }
}
