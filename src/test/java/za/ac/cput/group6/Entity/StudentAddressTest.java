package za.ac.cput.group6.Entity;

/**Student.java
 * Test for Student Address Entity
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentAddressTest {

    @Test
    public void test() {
        StudentAddress address = new

                StudentAddress.Builder()
                .setStudentId("21963252")
                .setAddressId("215")
                .build();
        System.out.println(address);

    }

}