package za.ac.cput.group6.Factory;


import za.ac.cput.group6.Entity.Student;
import za.ac.cput.group6.Util.GenerateID;

public class StudentFactory {


    public static Student createStudent(
                                       String firstName,
                                       String lastName,
                                        String cellphoneNo,
                                        String gender){

  String studentId=GenerateID.generateID();
   return new Student.Builder()
           .setStudentId(studentId)
           .setStudentFirstName(firstName)
           .setStudentLastName(lastName)
           .setCellphoneNo(cellphoneNo)
           .setGender(gender)
           .build();

    }


}
