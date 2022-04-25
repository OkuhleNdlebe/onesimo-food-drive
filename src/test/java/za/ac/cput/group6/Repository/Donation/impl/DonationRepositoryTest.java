package za.ac.cput.group6.Repository.Donation.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.group6.Entity.Donation;
import za.ac.cput.group6.Factory.DonationFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DonationRepositoryTest {

    private static DonationRepository repository = DonationRepository.getRepository();
    private Donation donation = DonationFactory.createDonation("Thimna","xolamngeni@gmail.com","0730052859");

    @Test
    @Order(1)
    void create(){
        Donation create = repository.create(donation);
        assertEquals(create.getDonationId(), donation.getDonationId());
        System.out.println("Created: " + create);

    }
    @Test
    @Order(2)
    void read(){
        Donation read = repository.read(donation.getDonationId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    @Order(3)
    void update(){
        Donation updated = new Donation.Builder().copy(donation).setDonationId("218268017").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }
    @Test
    @Order(4)
    void delete(){
        boolean delete = repository.delete(donation.getDonationId());
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
