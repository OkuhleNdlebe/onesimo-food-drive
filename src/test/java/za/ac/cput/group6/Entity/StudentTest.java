package za.ac.cput.group6.Entity;

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