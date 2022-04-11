/* DonorRepositoryTest.java
 * Class Repository Test for Donor.
 * Author: Bokang Molaoa [218131097]
 * Date: 07 April 2022
 */
package za.ac.cput.group6.Repository.DonorProfile.impl;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.DonorProfile;
import za.ac.cput.group6.Factory.DonorProfileFactory;


import static org.junit.jupiter.api.Assertions.*;

class DonorProfileRepositoryTest {
    private static DonorProfileRepository repository= DonorProfileRepository.getRepository();
    private static DonorProfile donorProfile= DonorProfileFactory.createDonorProfile("Bokang",
            "30 Dale","0781155816");

    @Test
    void create() {
        DonorProfile create = repository.create(donorProfile);
        assertEquals(create.getDonorId(), donorProfile.getDonorId());
        System.out.println("Created: " + create);
    }

    @Test
    void read() {
        DonorProfile read = repository.read(donorProfile.getDonorId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void update() {
        DonorProfile updated = new DonorProfile.Builder().copy(donorProfile).setDonorId("66240002").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    void delete() {
        boolean delete = repository.delete(donorProfile.getDonorId());
        assertTrue(delete);
        System.out.println("Deleted: " + delete);
    }

    @Test
    void getAll() {
            System.out.println("Display All: ");
            System.out.println(repository.getAll());
    }
}