package za.ac.cput.group6.Factory;

/**Student.java
 *Gender Factory
 * Author: Nkuna Justin(219319820)
 * Date: 10 April 2022
 */

import za.ac.cput.group6.Entity.Gender;
import za.ac.cput.group6.Util.GenerateID;

public class GenderFactory {


    public static Gender createGender(String genderName){

        String genderId= GenerateID.generateID();
        return new Gender.Builder()
                .setGenderId(genderId)
                .setGenderName(genderName)
                .build();

    }
}
