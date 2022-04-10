package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.StudentAddress;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class StudentAddressFactoryTest {
    @Test
    public void test() {

        StudentAddress address1 = StudentAddressFactory.createStudentAddress();

        assertNotNull(address1);
        System.out.println(address1);
    }
}