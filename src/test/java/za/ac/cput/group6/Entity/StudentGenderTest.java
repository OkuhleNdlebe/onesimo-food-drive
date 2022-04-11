package za.ac.cput.group6.Entity;

/**Student.java
 * Test for Student Gender Entity
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */

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