package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenderTest {

    @Test
    public void test() {

        Gender gender = new Gender.Builder()
                .setGenderId("2456abc")
                .setGenderName("Female")
                .build();
        System.out.println(gender);
    }
}