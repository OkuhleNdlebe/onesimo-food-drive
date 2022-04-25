package za.ac.cput.group6.Repository.DonationType.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.group6.Entity.DonationType;
import za.ac.cput.group6.Factory.DonationTypeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DonationTypeRepositoryTest {

    private static DonationTypeRepository repository = DonationTypeRepository.getRepository();
    private DonationType donationType = DonationTypeFactory.createDonationType("218268017","Toiletries");


    @Test
    @Order(1)
    void create(){
        DonationType create = repository.create(donationType);
        assertEquals(create.getDonationTypeId(), donationType.getDonationTypeId());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read(){
       DonationType read = repository.read(donationType.getDonationTypeId());
       assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    @Order(3)
    void update(){
        DonationType updated = new DonationType.Builder().copy(donationType).setDonationId("218268017").build();
        System.out.println("Updated " + updated);
        assertNotNull(updated);
    }
    @Test
    @Order(4)
    void delete(){
        boolean delete = repository.delete(donationType.getDonationTypeId());
        assertTrue(delete);
        System.out.println("Deleted: " + delete);
    }
    @Test
    @Order(5)
    void getAll(){

        System.out.println("Display All: ");
        System.out.println(repository.getAll());
    }
}