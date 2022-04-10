package za.ac.cput.group6.Repository.GenderRepository;

import za.ac.cput.group6.Entity.Gender;

import java.util.HashSet;
import java.util.Set;

public class GenderRepository implements IGenderRepository {

    private static GenderRepository genderRepository = null;
    private Set<Gender> genderDB = null;

    private GenderRepository() {
        genderDB = new HashSet<Gender>();

    }

    public static GenderRepository getGenderRepository(){
        if (genderRepository == null) {

            genderRepository = new GenderRepository();

        }

        return genderRepository;

    }

    @Override
    public Gender create(Gender gender) {
        boolean success=genderDB.add(gender);
        if(!success){

            return null;}
        return  gender;
    }

    @Override
    public Gender read(String genderID) {
        for(Gender gender:genderDB)
            if(gender.equals(genderID)){

                return  gender;
            }
        return null;
    }
    @Override
    public Gender update(Gender gender) {
        Gender gender1=read("4554hj");
        if(gender1!=null){

            genderDB.remove(gender1);
            genderDB.add(gender);
            return gender;

        }

        return null;
    }

    @Override
    public boolean delete(String genderID) {
 Gender genderToDelete=read(genderID);
        if (genderToDelete==null)
        {

            return false;
        }
        genderDB.remove(genderToDelete);
        return true;


    }
    @Override
    public Set<Gender> getAll() {
        return genderDB;
    }


}