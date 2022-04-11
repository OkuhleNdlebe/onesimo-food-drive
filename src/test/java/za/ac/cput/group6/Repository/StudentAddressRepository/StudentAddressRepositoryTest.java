package za.ac.cput.group6.Repository.StudentAddressRepository;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.StudentAddress;

import za.ac.cput.group6.Factory.StudentAddressFactory;


import static org.junit.jupiter.api.Assertions.*;

class StudentAddressRepositoryTest {

    private static StudentAddressRepository repository=StudentAddressRepository.getRepository();
    private static StudentAddress addressRepo= StudentAddressFactory.createStudentAddress();

    @Test
    @Order(1)
    void create(){
        StudentAddress create =repository.create(addressRepo);
        assertEquals(create.getAddressId(),addressRepo.getAddressId());
        System.out.printf(create+" Created ");

    }

    @Test
    @Order(2)
    void read() {
        StudentAddress read = repository.read(addressRepo.getAddressId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        StudentAddress updated = new StudentAddress.Builder().copy(addressRepo).setAddressId("WRF1254").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(addressRepo.getAddressId());
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