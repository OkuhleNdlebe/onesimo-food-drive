package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonationTest {
    @Test
    public void test() {
        Donation donation = new Donation.Builder()
                .setDonationId("21231314")
                .setDonorName("Xola Mngeni")
                .setEmail("xolamngeni@gmail.com")
                .setTelephoneNumber("0730052859")
                .build();
        System.out.println(donation);

    }
}