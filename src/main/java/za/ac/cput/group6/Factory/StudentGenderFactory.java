package za.ac.cput.group6.Factory;



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
