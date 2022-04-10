/* ParcelTest.java
Test ParcelStoreEntity.
Author: Bokang Molaoa (218131097).
Date: 07 April 2021
*/
package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

public class ParcelStoreTest {
    @Test
    public void test() {
        ParcelStore parcelStore = new ParcelStore.Builder()
                .setParcelStoreId("58556455540151")
                .setParcelStoreDescr("The Storage has got 500 Packages that needs to be handed out")
                .setIsStoreFull(false)
                .build();
        System.out.println(parcelStore);

    }
}
