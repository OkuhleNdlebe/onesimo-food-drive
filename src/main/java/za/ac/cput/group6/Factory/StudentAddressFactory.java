package za.ac.cput.group6.Factory;

/**Student.java
 * Student Address Factory
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */

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
