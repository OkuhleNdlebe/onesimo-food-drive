package za.ac.cput.group6.Factory;

/*
Author: Xola Mngeni
Student number: 218268017
Date: 10 April 2022
ADP assignment 1
 */

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
