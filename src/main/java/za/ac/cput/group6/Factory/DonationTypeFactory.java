package za.ac.cput.group6.Factory;

import za.ac.cput.group6.Entity.Donation;
import za.ac.cput.group6.Entity.DonationType;
import za.ac.cput.group6.Util.GenerateID;

public class DonationTypeFactory {
    public static DonationType createDonationType(String donationId,String donationTypeDescrId){
        String donationTypeId = GenerateID.generateID();
        return new DonationType.Builder().setDonationTypeId(donationTypeId)
                .setDonationTypeDescrId("")
                .setDonationId("")
                .build();


    }
}
