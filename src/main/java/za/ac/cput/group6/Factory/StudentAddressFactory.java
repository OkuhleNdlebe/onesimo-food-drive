package za.ac.cput.group6.Factory;

import za.ac.cput.group6.Entity.StudentAddress;

import za.ac.cput.group6.Util.GenerateID;

public class StudentAddressFactory {

    public static StudentAddress createStudentAddress() {

        String studentId = GenerateID.generateID();
        String addressId = GenerateID.generateID();
        return new StudentAddress.Builder()
                .setStudentId(studentId)
                .setAddressId(addressId)
                .build();

    }
}
