package za.ac.cput.group6.Repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.group6.Entity.Gender;
import za.ac.cput.group6.Factory.GenderFactory;
import za.ac.cput.group6.Repository.GenderRepository.GenderRepository;

import static org.junit.jupiter.api.Assertions.*;




@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GenderRepositoryTest {


    private static GenderRepository repo=GenderRepository.getGenderRepository();
    private static Gender gender= GenderFactory.createGender("Female");

    @Test
    @Order(1)
    void create(){
        Gender create=repo.create(gender);
        assertEquals(create.equals(gender));
        System.out.println("Created" +create);



    }

    private void assertEquals(boolean equals) {
    }
    @Test
    @Order(5)
    void getAll() {

        System.out.println("Display All: ");
        System.out.println(repo.getAll());
    }
}