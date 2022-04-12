/* ParcelStoreRepositoryTest.java
 * Class Repository Test for ParcelStore.
 * Author: Bokang Molaoa [218131097]
 * Date: 07 April 2022
 */
package za.ac.cput.group6.Repository.ParcelStore.impl;
import org.junit.jupiter.api.*;
import za.ac.cput.group6.Entity.ParcelStore;
import za.ac.cput.group6.Factory.ParcelStoreFactory;
import za.ac.cput.group6.Repository.ParcelStore.impl.ParcelStoreRepository;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class ParcelStoreRepositoryTest {

    private static ParcelStoreRepository repository = ParcelStoreRepository.getRepository();
    private static ParcelStore parcelStore = ParcelStoreFactory.createParcelStore("The storeroom still have space for parcel", false);

    @Test
    @Order(1)
    void create() {
        ParcelStore create = repository.create(parcelStore);
        assertEquals(create.getParcelStoreId(), parcelStore.getParcelStoreId());
        System.out.println("Created: " + create);
    }

    @Test
    @Order(2)
    void read() {
        ParcelStore read = repository.read(parcelStore.getParcelStoreId());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    @Order(3)
    void update() {
        ParcelStore updated = new ParcelStore.Builder().copy(parcelStore).setParcelStoreId("2151254").build();
        System.out.println("Updated: " + updated);
        assertNotNull(updated);
    }

    @Test
    @Order(4)
    void delete() {
        boolean delete = repository.delete(parcelStore.getParcelStoreId());
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