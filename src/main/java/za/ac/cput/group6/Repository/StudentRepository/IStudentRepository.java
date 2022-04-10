package za.ac.cput.group6.Repository.StudentRepository;

import za.ac.cput.group6.Entity.Distribution;
import za.ac.cput.group6.Entity.Student;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IStudentRepository extends IRepository<Student,String> {

    public Set<Student> getAll();

}
