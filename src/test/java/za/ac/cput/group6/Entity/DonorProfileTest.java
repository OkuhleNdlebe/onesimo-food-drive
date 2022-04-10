/* DonorProfileTest.java
Test DonorProfileEntity.
Author: Bokang Molaoa (218131097).
Date: 07 April 2021
*/
package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

public class DonorProfileTest {
    @Test
    public void test() {
        DonorProfile donorProfile = new DonorProfile.Builder()
                .setDonorId("21231314")
                .setDonorName("Xola Mngeni")
                .setDonorAddress("xolamngeni@gmail.com")
                .setDonorContact("0730052859")
                .build();
        System.out.println(donorProfile);

    }
}
