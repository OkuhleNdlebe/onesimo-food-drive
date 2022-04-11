/* DonorRepositoryTest.java
 * Class Repository Test for Donor.
 * Author: Bokang Molaoa [218131097]
 * Date: 07 April 2022
 */
package za.ac.cput.group6.Repository.Donor.impl;
import org.junit.jupiter.api.*;
import za.ac.cput.group6.Entity.Donor;
import za.ac.cput.group6.Factory.DonorFactory;
import za.ac.cput.group6.Repository.Donor.impl.DonorRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DonorRepositoryTest {
    private static DonorRepository repository = DonorRepository.getRepository();
    private static Donor donor = DonorFactory.createDonor("Cisco","ciscosa@mail.com","0218854666");

    @Test
    @Order(1)
    void create() {
        Donor create = repository.create(donor);
        assertEquals(create.getDonorId(), donor.getDonorId());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read() {
        Donor read = repository.read(donor.getDonorId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        Donor updated = new Donor.Builder().copy(donor).setDonorId("142254002").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(donor.getDonorId());
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



