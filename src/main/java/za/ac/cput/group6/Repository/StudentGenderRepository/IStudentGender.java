package za.ac.cput.group6.Repository.StudentGenderRepository;

import za.ac.cput.group6.Entity.StudentGender;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IStudentGender extends IRepository<StudentGender,String> {

public Set<StudentGender> getAll();

}
