package za.ac.cput.group6.Repository.StudentRepository;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.Student;
import za.ac.cput.group6.Entity.StudentGender;
import za.ac.cput.group6.Factory.StudentFactory;
import za.ac.cput.group6.Factory.StudentGenderFactory;
import za.ac.cput.group6.Repository.StudentGenderRepository.StudentGenderRepository;

import static org.junit.jupiter.api.Assertions.*;

class StudentRepositoryTest {

    private static StudentRepository repository=StudentRepository.getRepository();
    private static Student student= StudentFactory.createStudent("Fortunate","Nkuna","0794446623","Femalee");

    @Test
    @Order(1)
    void create(){
        Student create =repository.create(student);
        assertEquals(create.getStudentId(),student.getStudentId());
        System.out.printf(create+" Created ");

    }

    @Test
    @Order(2)
    void read() {
        Student read = repository.read(student.getStudentId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        Student updated = new Student.Builder().copy(student).setStudentId("219319820").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(student.getStudentId());
        assertTrue(delete);
        System.out.println("Deleted: " + delete);
    }
    @Test
    @Order(5)
    void getAll() {

        System.out.println("Display All: ");
        System.out.println(repository.getAll());
    }



}