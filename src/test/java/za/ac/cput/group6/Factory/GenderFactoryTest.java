package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.Gender;
import za.ac.cput.group6.Entity.Student;

import static org.junit.jupiter.api.Assertions.*;

class GenderFactoryTest {

    @Test
    public void test(){

        Gender gender1=GenderFactory.createGender("Female");
            assertNotNull(gender1);
            System.out.println(gender1);
        }

        }

