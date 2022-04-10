package za.ac.cput.group6.Repository.ParcelType.impl;
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
import za.ac.cput.group6.Entity.ParcelType;
import za.ac.cput.group6.Factory.ParcelTypeFactory;
import za.ac.cput.group6.Repository.FundingStatus.impl.FundingStatusRepository;

import static org.junit.jupiter.api.Assertions.*;

class ParcelTypeRepositoryTest {

    private static ParcelTypeRepository repository= ParcelTypeRepository.getRepository();
    private static ParcelType parcelType = ParcelTypeFactory.createParcelType("Study Packge", "pen , rule, lid, rub, calculator");

    @Test
    @Order(1)
    void create() {
        ParcelType create = repository.create(parcelType);
        assertEquals(create.getParcelTypeId(), parcelType.getParcelTypeId());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read() {
        ParcelType read = repository.read(parcelType.getParcelTypeId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        ParcelType updated = new ParcelType.Builder().copy(parcelType).setParcelTypeId("213847eye738").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(parcelType.getParcelTypeId());
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