package za.ac.cput.group6.Repository.StudentGenderRepository;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;


import za.ac.cput.group6.Entity.StudentGender;
import za.ac.cput.group6.Factory.StudentGenderFactory;


import static org.junit.jupiter.api.Assertions.*;

class StudentGenderRepositoryTest {

    private static StudentGenderRepository repository=StudentGenderRepository.getRepository();
    private static StudentGender genderRepo= StudentGenderFactory.createStudentGender();

    @Test
    @Order(1)
    void create(){
        StudentGender create =repository.create(genderRepo);
        assertEquals(create.getGenderId(),genderRepo.getGenderId());
        System.out.printf(create+" Created ");

    }

    @Test
    @Order(2)
    void read() {
        StudentGender read = repository.read(genderRepo.getGenderId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        StudentGender updated = new StudentGender.Builder().copy(genderRepo).setGenderId("We145g").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(genderRepo.getGenderId());
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