package za.ac.cput.group6.Factory;

import za.ac.cput.group6.Entity.Donation;
import za.ac.cput.group6.Util.GenerateID;

public class DonationFactory {
    public static Donation createDonation(String donorName, String email, String telephoneNumber){
        String donationId = GenerateID.generateID();
        return new Donation.Builder().setDonationId(donationId)
                .setDonorName(donorName)
                .setEmail(email)
                .setTelephoneNumber(telephoneNumber)
                .build();
    }
}
