package za.ac.cput.group6.Factory;

/**Student.java
 * Student Factory Test
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */


import org.junit.jupiter.api.Test;

import za.ac.cput.group6.Entity.Student;

import static org.junit.jupiter.api.Assertions.*;

public class StudentFactoryTest {
    @Test
    public void test(){

        Student student1=StudentFactory.createStudent("Fortunate","Nkuna", "0715136155","Female");
        assertNotNull(student1);
        System.out.println(student1);
    }



}