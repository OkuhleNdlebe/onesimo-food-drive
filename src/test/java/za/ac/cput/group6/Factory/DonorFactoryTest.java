/* DonorFactoryTest.java
Test DonorFactory.
Author: Bokang Molaoa (218131097).
Date: 07 April 2021
*/
package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.group6.Entity.Donor;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DonorFactoryTest {
    @Test
    public void createDonorTest() {
        Donor donor = DonorFactory.createDonor("KFC", "kfcsa@co.za", "0215484555");
        System.out.println(donor);
        assertNotNull(donor);
    }

    @Test
    void testEquality() {
       Donor donor1 = new Donor.Builder().setTelephoneNumber("0781155816").build();
       Donor donor2 = donor1;
        assertEquals(donor2,donor1);
    }

    @Test
    void testIdentity() {
        Donor donor1 = new Donor.Builder().setTelephoneNumber("0781155816").build();
        Donor donor2 = donor1;
        assertSame(donor2,donor1);
    }

    @Test
    @Disabled
    void createDonorDisable() {
        Donor donor = DonorFactory.createDonor("Coca Cola", "cocacolasa.co.za", "0218554888");
        System.out.println(donor);
        assertNotNull(donor);
    }

    @Test
    @Timeout(10)
    void timeOut() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Testing Timed Out");
    }
}
