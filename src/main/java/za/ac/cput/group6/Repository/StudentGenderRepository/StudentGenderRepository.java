package za.ac.cput.group6.Repository.StudentGenderRepository;

import za.ac.cput.group6.Entity.StudentGender;
import java.util.HashSet;
import java.util.Set;

public class StudentGenderRepository implements IStudentGender{


    private static StudentGenderRepository repository = null;
    private Set<StudentGender> studentGenderDB = null;

    private StudentGenderRepository() {

        studentGenderDB = new HashSet<StudentGender>();
    }

    public static StudentGenderRepository getRepository() {

        if (repository == null) {

            repository = new StudentGenderRepository();
        }
        return repository;
    }

    @Override
    public StudentGender create(StudentGender gender) {

        boolean success = studentGenderDB.add(gender);
        if (!success)
            return null;
        return gender;


    }

    @Override
    public StudentGender read(String genderId) {

        for (StudentGender g : studentGenderDB)
            if (g.getGenderId().equals(genderId)) {

                return g;
            }
        return null;
    }

    @Override
    public StudentGender update(StudentGender gender) {

        StudentGender gender1 = read(gender.getGenderId());
        if (gender1 != null) {

            studentGenderDB.remove(gender1);
            studentGenderDB.add(gender);
            return gender;

        }
        return null;
    }

    @Override
    public boolean delete(String genderId) {
        StudentGender genderToDelete = read(genderId);
        if (genderToDelete == null)

            return false;
        studentGenderDB.remove(genderToDelete);
        return true;
    }

    @Override
    public Set<StudentGender> getAll() {
        return studentGenderDB;
    }
}
