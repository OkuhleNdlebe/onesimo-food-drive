package za.ac.cput.group6.Factory;


/**StudentRepository.java
 *  StudentRepository Gender Factory
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */


import za.ac.cput.group6.Entity.StudentGender;
import za.ac.cput.group6.Util.GenerateID;

public class StudentGenderFactory {

    public static StudentGender createStudentGender(){

        String studentId= GenerateID.generateID();
        String genderId=GenerateID.generateID();
        return new StudentGender.Builder()
                .setStudentId(studentId)
                .setGenderId(genderId)
                .build();

    }




}
