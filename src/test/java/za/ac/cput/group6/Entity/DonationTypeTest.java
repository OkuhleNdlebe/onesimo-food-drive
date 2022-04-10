package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonationTypeTest {
    @Test
    public void test(){
        DonationType donationType = new DonationType.Builder()
                .setDonationTypeId("")
                .setDonationId("218268017")
                .setDonationTypeDescrId("Toiletries")
                .build();
        System.out.println(donationType);



    }

}