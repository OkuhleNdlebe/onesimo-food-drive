package za.ac.cput.group6.Factory;

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
