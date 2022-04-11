package za.ac.cput.group6.Repository.StudentAddressRepository;

import za.ac.cput.group6.Entity.StudentAddress;
import za.ac.cput.group6.Entity.StudentGender;
import za.ac.cput.group6.Repository.StudentGenderRepository.IStudentGender;
import za.ac.cput.group6.Repository.StudentGenderRepository.StudentGenderRepository;

import java.util.HashSet;
import java.util.Set;

public class StudentAddressRepository implements IStudentAddress {


    private static StudentAddressRepository repository = null;
    private Set<StudentAddress> studentAddressDB = null;

    private StudentAddressRepository() {

        studentAddressDB = new HashSet<StudentAddress>();
    }

    public static StudentAddressRepository getRepository() {

        if (repository == null) {

            repository = new StudentAddressRepository();
        }
        return repository;
    }

    @Override
    public StudentAddress create(StudentAddress address) {

        boolean success = studentAddressDB.add(address);
        if (!success)
            return null;
        return address;


    }

    @Override
    public StudentAddress read(String addressId) {

        for (StudentAddress g : studentAddressDB)
            if (g.getAddressId().equals(addressId)) {

                return g;
            }
        return null;
    }

    @Override
    public StudentAddress update(StudentAddress address) {

        StudentAddress address1 = read(address.getAddressId());
        if (address1 != null) {

            studentAddressDB.remove(address1);
            studentAddressDB.add(address1);
            return address;

        }
        return null;
    }

    @Override
    public boolean delete(String addressId) {
        StudentAddress addressToDelete = read(addressId);
        if (addressToDelete == null)

            return false;
        studentAddressDB.remove(addressToDelete);
        return true;
    }

    @Override
    public Set<StudentAddress> getAll() {
        return studentAddressDB;
    }

}
