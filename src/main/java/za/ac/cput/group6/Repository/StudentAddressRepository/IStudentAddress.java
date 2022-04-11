package za.ac.cput.group6.Repository.StudentAddressRepository;

import za.ac.cput.group6.Entity.StudentAddress;

import za.ac.cput.group6.Repository.IRepository;


import java.util.Set;

public interface IStudentAddress extends IRepository<StudentAddress,String> {

    public Set<StudentAddress> getAll();

}
