package za.ac.cput.group6.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.group6.Entity.FundingStatus;
import za.ac.cput.group6.Factory.FundingStatusFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FundingStatusRepositoryTest {
    private static FundingStatusRepository repository= FundingStatusRepository.getRepository();
    private static FundingStatus fundingStatus = FundingStatusFactory.createFundingStatus("210058", true, "25.03.2020");

    @Test
    @Order(1)
    void create() {
        FundingStatus create = repository.create(fundingStatus);
        assertEquals(create.getStudentID(), fundingStatus.getStudentID());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read() {
        FundingStatus read = repository.read(fundingStatus.getStudentID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        FundingStatus updated = new FundingStatus.Builder().copy(fundingStatus).setStudentID("218196245").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(fundingStatus.getStudentID());
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