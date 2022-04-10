package za.ac.cput.group6.Repository;

import org.junit.jupiter.api.*;
import za.ac.cput.group6.Entity.Distribution;
import za.ac.cput.group6.Factory.DistributionFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class DistributionRepositoryTest {

    private static DistributionRepository repository= DistributionRepository.getRepository();
    private static Distribution distribution= DistributionFactory.createDistribution("025", "zodwa",
            "mduli","zodwam@gmail.com", "catsville");

    @Test
    @Order(1)
    void create() {
        Distribution create = repository.create(distribution);
        assertEquals(create.getDistributionId(), distribution.getDistributionId());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read() {
        Distribution read = repository.read(distribution.getDistributionId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
       Distribution updated = new Distribution.Builder().copy(distribution).setDistributionId("002").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }
    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(distribution.getDistributionId());
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