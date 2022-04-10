package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.Donation;
import za.ac.cput.group6.Entity.ParcelType;

import static org.junit.jupiter.api.Assertions.*;

class DonationFactoryTest {
    @Test
    public void test(){
        Donation donation= DonationFactory.createDonation("Xola Mngeni", "xolamngeni@gmail.com","0730052859");
        assertNotNull(donation);
        System.out.println(donation);
    }

}