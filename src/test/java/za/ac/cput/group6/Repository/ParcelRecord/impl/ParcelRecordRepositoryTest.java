package za.ac.cput.group6.Repository.ParcelRecord.impl;
/*
*Name: Okuhle
* Surname: Ndlebe
* Group Role: Group lead
* Student number : 218338619
* Date : 10 April 2022
* Term one Assignment on Builder Pattern
 */
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.ParcelRecord;
import za.ac.cput.group6.Factory.ParcelRecordFactory;
import za.ac.cput.group6.Repository.FundingStatus.impl.FundingStatusRepository;

import static org.junit.jupiter.api.Assertions.*;

class ParcelRecordRepositoryTest {

    private static ParcelRecordRepository repository= ParcelRecordRepository.getRepository();
    private static ParcelRecord parcelRecord = ParcelRecordFactory.createParcelRecord("21345454", "The student is staying on campus and their packs are delivered by Bokang");

    @Test
    @Order(1)
    void create() {
        ParcelRecord create = repository.create(parcelRecord);
        assertEquals(create.getParcelRecordId(), parcelRecord.getParcelRecordId());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read() {
        ParcelRecord read = repository.read(parcelRecord.getParcelRecordId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        ParcelRecord updated = new ParcelRecord.Builder().copy(parcelRecord)
                .setParcelRecordId("64746437").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(parcelRecord.getParcelRecordId());
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