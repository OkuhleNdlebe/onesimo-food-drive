/* DonorTest.java
Test DonorEntity.
Author: Bokang Molaoa (218131097).
Date: 07 April 2021
*/
package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

public class DonorTest {
    @Test
    public void test() {
        Donor donor = new Donor.Builder()
                .setDonorId("21231314")
                .setDonorName("Zola Monika")
                .setEmail("zolamonika@gmail.com")
                .setTelephoneNumber("0730052859")
                .build();
        System.out.println(donor);

    }
}
