/* DonorProfileFactoryTest.java
Test DonorProfileFactory.
Author: Bokang Molaoa (218131097).
Date: 07 April 2021
*/
package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import za.ac.cput.group6.Entity.DonorProfile;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DonorProfileFactoryTest {
    @Test
    public void createDonorProfileTest() {
        DonorProfile donorProfile = DonorProfileFactory.createDonorProfile("Bokang Molaoa",
                "30778 Magqaza Street Asanda Village Strand, 7140","0781155816");
        System.out.println(donorProfile);
        assertNotNull(donorProfile);
    }

    @Test
    void testEquality() {
        DonorProfile donorProfile1 = new DonorProfile.Builder().setDonorContact("0781155816").build();
        DonorProfile donorProfile2 = donorProfile1;
        assertEquals(donorProfile2,donorProfile1);
    }

    @Test
    void testIdentity() {
        DonorProfile donorProfile1 = new DonorProfile.Builder().setDonorContact("0781155816").build();
        DonorProfile donorProfile2 = donorProfile1;
        assertSame(donorProfile2,donorProfile1);
    }

    @Test
    @Disabled
    void createDonorProfileDisable() {
        DonorProfile donorProfile = DonorProfileFactory.createDonorProfile("Thabang Molaoa","78 Midrand",
        "0755858556");
        System.out.println(donorProfile);
        assertNotNull(donorProfile);
    }

    @Test
    @Timeout(10)
    void timeOut() throws InterruptedException {
        Thread.sleep(100);
        System.out.println("Testing Timed Out");
    }
}
