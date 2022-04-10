package za.ac.cput.group6.Repository.ParcelPack.impl;
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
import za.ac.cput.group6.Entity.ParcelPack;
import za.ac.cput.group6.Factory.ParcelFactory;
import za.ac.cput.group6.Repository.ParcelPack.impl.ParcelPackRepository;

import static org.junit.jupiter.api.Assertions.*;

class ParcelPackRepositoryTest {

    private static ParcelPackRepository repository= ParcelPackRepository.getRepository();
    private static ParcelPack parcelPack = ParcelFactory.createParcel("20/04/2022","Shoes, Shirts, Pads, toothpast","Female Package");

    @Test
    @Order(1)
    void create() {
        ParcelPack create = repository.create(parcelPack);
        assertEquals(create.getParcelRecordId(), parcelPack.getParcelRecordId());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read() {
        ParcelPack read = repository.read(parcelPack.getParcelRecordId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        ParcelPack updated = new ParcelPack.Builder().copy(parcelPack).setParcelPackId("218196245").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(parcelPack.getParcelRecordId());
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