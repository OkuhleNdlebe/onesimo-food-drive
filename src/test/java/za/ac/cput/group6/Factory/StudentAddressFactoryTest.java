package za.ac.cput.group6.Factory;

/**Student.java
 * Student Address Factory Test
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */

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