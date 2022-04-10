package za.ac.cput.group6.Factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.group6.Entity.DonationRecord;

import static org.junit.jupiter.api.Assertions.*;

class DonationRecordFactoryTest {
    @Test
    public void test(){
        DonationRecord donationRecord = DonationRecordFactory.createDonationRecord("218268017",02232022);
        assertNotNull(donationRecord);
        System.out.println(donationRecord);
    }

}