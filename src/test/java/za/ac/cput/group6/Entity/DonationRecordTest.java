package za.ac.cput.group6.Entity;

import org.junit.jupiter.api.Test;

class DonationRecordTest {
@Test
    public void test(){
    DonationRecord donationRecord = new DonationRecord.Builder()
            .setDonationId("218268017")
            .setDonationRecordDate(02232022)
            .setDonationRecordId("")
            .build();
    System.out.println(donationRecord);
}
}