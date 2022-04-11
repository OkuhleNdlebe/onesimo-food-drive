package za.ac.cput.group6.Repository.GenderRepository.impl;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.Gender;
import za.ac.cput.group6.Factory.GenderFactory;

import static org.junit.jupiter.api.Assertions.*;

class GenderRepositoryTest {

    private static GenderRepository repository=GenderRepository.getRepository();
    private static Gender genderRepo= GenderFactory.createGender("Female");

    @Test
    @Order(1)
    void create(){
        Gender create =repository.create(genderRepo);
        assertEquals(create.getGenderId(),genderRepo.getGenderId());
        System.out.printf(create+" Created ");

    }

    @Test
    @Order(2)
    void read() {
        Gender read = repository.read(genderRepo.getGenderId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        Gender updated = new Gender.Builder().copy(genderRepo).setGenderId("We145g").build();
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