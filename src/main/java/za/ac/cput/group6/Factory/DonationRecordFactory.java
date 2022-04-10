package za.ac.cput.group6.Factory;

import za.ac.cput.group6.Entity.DonationRecord;
import za.ac.cput.group6.Util.GenerateID;

public class DonationRecordFactory {
    public static DonationRecord createDonationRecord(String donationId, int donationRecordDate){
        String donationRecordId = GenerateID.generateID();
        return new DonationRecord.Builder().setDonationRecordId(donationRecordId)
                .setDonationId(donationId)
                .setDonationRecordDate(donationRecordDate)
                .build();

    }
}
