package za.ac.cput.group6.Repository.StudentAddress;

import za.ac.cput.group6.Entity.Distribution;
import za.ac.cput.group6.Entity.StudentAddress;
import za.ac.cput.group6.Repository.GenderRepository.IGenderRepository;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IStudentAddressRepository extends IRepository <StudentAddress,String>{

    public Set<StudentAddress> getAll();


}
