/* ParcelStoreFactoryTest.java
Test ParcelStoreFactory.
Author: Bokang Molaoa (218131097).
Date: 07 April 2021
*/
package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.group6.Entity.ParcelStore;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ParcelStoreTest {
    @Test
    public void createParcelStoreTest() {
        ParcelStore parcelStore = ParcelStoreFactory.createParcelStore("The storage still have space"
                ,true );
        System.out.println(parcelStore);
        assertNotNull(parcelStore);
    }

    @Test
    void testEquality() {
        ParcelStore parcelStore1 = new ParcelStore.Builder().setParcelStoreId("0781155816").build();
        ParcelStore parcelStore2 = parcelStore1;
        assertEquals(parcelStore2,parcelStore1);
    }

    @Test
    void testIdentity() {
        ParcelStore parcelStore1 = new ParcelStore.Builder().setParcelStoreId("0781155816").build();
        ParcelStore parcelStore2 = parcelStore1;
        assertSame(parcelStore2,parcelStore1);
    }

    @Test
    @Disabled
    void createDonorDisable() {
        ParcelStore parcelStore = ParcelStoreFactory.createParcelStore("The storage still have space", true);
        System.out.println(parcelStore);
        assertNotNull(parcelStore);
    }

    @Test
    @Timeout(10)
    void timeOut() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Testing Timed Out");
    }
}
