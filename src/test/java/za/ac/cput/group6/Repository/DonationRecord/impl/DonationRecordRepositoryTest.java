package za.ac.cput.group6.Repository.DonationRecord.impl;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.group6.Entity.DonationRecord;
import za.ac.cput.group6.Factory.DonationRecordFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DonationRecordRepositoryTest {
    private static DonationRecordRepository repository = DonationRecordRepository.getRepository();
    private static DonationRecord donationRecord = DonationRecordFactory.createDonationRecord("218268017",21032022);

    @Test
    @Order(1)
    void create(){
        DonationRecord create = repository.create(donationRecord);
        assertEquals(create.getDonationRecordId(), donationRecord.getDonationRecordId());
        System.out.println("Created: " + create);
    }
    @Test
    @Order(2)
    void read(){
        DonationRecord read = repository.read(donationRecord.getDonationRecordId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update(){
        DonationRecord updated = new DonationRecord.Builder().copy(donationRecord).setDonationRecordId("218268017").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }
    @Test
    @Order(4)
    void delete(){
        boolean delete = repository.delete(donationRecord.getDonationRecordId());
        assertTrue(delete);
        System.out.println("Deleted " + delete);
    }
    @Test
    @Order(5)
    void getAll(){
        System.out.println("Display All: ");
        System.out.println(repository.getAll());
    }

}