package za.ac.cput.group6.Repository.StudentRepository;

import za.ac.cput.group6.Entity.Student;


import java.util.HashSet;
import java.util.Set;

public class StudentRepository implements IStudentRepository{


    private static StudentRepository repository = null;
    private Set<Student> studentDB = null;

    private StudentRepository() {

        studentDB = new HashSet<Student>();
    }

    public static StudentRepository getRepository() {

        if (repository == null) {

            repository = new StudentRepository();
        }
        return repository;
    }

    @Override
    public Student create(Student student) {

        boolean success = studentDB.add(student);
        if (!success)
            return null;
        return student;



    }

    @Override
    public Student read(String studentId) {

        for (Student g : studentDB)
            if (g.getStudentId().equals(studentId)) {

                return g;
            }
        return null;
    }

    @Override
    public Student update(Student student) {

        Student student1 = read(student.getStudentId());
        if (student1 != null) {

            studentDB.remove(student1);
            studentDB.add(student);
            return student;

        }
        return null;
    }

    @Override
    public boolean delete(String studentId) {
        Student studentToDelete = read(studentId);
        if (studentToDelete == null)

            return false;
        studentDB.remove(studentToDelete);
        return true;
    }

    @Override
    public Set<Student> getAll() {
        return studentDB;
    }
}
