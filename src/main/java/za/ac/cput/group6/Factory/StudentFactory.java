package za.ac.cput.group6.Factory;

/**Student.java
 *Student Factory
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */


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
