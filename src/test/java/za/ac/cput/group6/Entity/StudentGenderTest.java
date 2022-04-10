package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentGenderTest {

    @Test
    public void test() {

        StudentGender studentGender = new StudentGender.Builder()
                .setStudentId("98754")
                .setGenderId("5694poul")
                .build();

        System.out.println(studentGender);

    }
}