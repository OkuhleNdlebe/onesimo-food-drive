package za.ac.cput.group6.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.group6.Entity.ParcelRequest;
import za.ac.cput.group6.Factory.ParcelRequestFactory;
import za.ac.cput.group6.Repository.ParcelRequest.impl.ParcelRequestRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ParcelRequestRepositoryTest {

    private static ParcelRequestRepository repository= ParcelRequestRepository.getRepository();
    private static ParcelRequest parcelRequest= ParcelRequestFactory.createParcelRequest("Appliances", "21.01.2022");

    @Test
    @Order(1)
    void create() {
        ParcelRequest create = repository.create(parcelRequest);
        assertEquals(create.getParcelRequestId(), parcelRequest.getParcelRequestId());
        System.out.println("Created: " + create);
    }
    @Test
    @Order(2)
    void read() {
       ParcelRequest read = repository.read(parcelRequest.getParcelRequestId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }
    @Test
    @Order(3)
    void update() {
        ParcelRequest updated = new ParcelRequest.Builder().copy(parcelRequest).setParcelRequestId("2587").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(parcelRequest.getParcelRequestId());
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