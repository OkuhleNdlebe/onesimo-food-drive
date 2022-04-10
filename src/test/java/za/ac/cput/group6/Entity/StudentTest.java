package za.ac.cput.group6.Entity;
/**Student.java
 * Test for Student Entity
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void test() {
        Student student = new Student.Builder()
                .setStudentId("219319820")
                .setStudentFirstName("Fortunate")
                .setStudentLastName("Nkuna")
                .setCellphoneNo("0715136155")
                .setGender("Female")
                .build();

        System.out.println(student);

    }
}