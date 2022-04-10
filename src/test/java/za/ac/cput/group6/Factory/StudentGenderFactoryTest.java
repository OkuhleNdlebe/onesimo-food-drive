package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Test;

import za.ac.cput.group6.Entity.StudentGender;

import static org.junit.jupiter.api.Assertions.*;

class StudentGenderFactoryTest {

    @Test
    public void createStudentGender() {
StudentGender gender1=StudentGenderFactory.createStudentGender();
        assertNotNull(gender1);
        System.out.println(gender1);

        }

    }
