package za.ac.cput.group6.Repository.GenderRepository.impl;

import za.ac.cput.group6.Entity.Gender;
import za.ac.cput.group6.Repository.GenderRepository.IGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class GenderRepository implements IGenderRepository {

    private static GenderRepository repository = null;
    private Set<Gender> genderDB = null;

    private GenderRepository() {

        genderDB = new HashSet<Gender>();
    }

    public static GenderRepository getRepository() {

        if (repository == null) {

            repository = new GenderRepository();
        }
        return repository;
    }

    @Override
    public Gender create(Gender gender) {

        boolean success = genderDB.add(gender);
        if (!success)
            return null;
        return gender;


    }

    @Override
    public Gender read(String genderId) {

        for (Gender g : genderDB)
            if (g.getGenderId().equals(genderId)) {

                return g;
            }
        return null;
    }

    @Override
    public Gender update(Gender gender) {

        Gender gender1 = read(gender.getGenderId());
        if (gender1 != null) {

            genderDB.remove(gender1);
            genderDB.add(gender);
            return gender;

        }
        return null;
    }

    @Override
    public boolean delete(String genderId) {
        Gender genderToDelete = read(genderId);
        if (genderToDelete == null)

            return false;
        genderDB.remove(genderToDelete);
        return true;
    }

    @Override
    public Set<Gender> getAll() {
        return genderDB;
    }
}
