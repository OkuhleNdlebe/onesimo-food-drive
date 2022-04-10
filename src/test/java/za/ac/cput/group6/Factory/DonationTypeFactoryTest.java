package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.DonationType;

import static org.junit.jupiter.api.Assertions.*;

class DonationTypeFactoryTest {
    @Test
    public void test(){
        DonationType donationType = DonationTypeFactory.createDonationType("218268017","Toiletries");
        assertNotNull(donationType);
        System.out.println(donationType);
    }

}