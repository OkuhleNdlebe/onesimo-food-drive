package za.ac.cput.group6.Entity;

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