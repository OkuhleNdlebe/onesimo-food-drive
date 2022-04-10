package za.ac.cput.group6.Factory;

import za.ac.cput.group6.Entity.Donation;

public class DonationFactory {
    public static Donation createDonation(String donationId, String donorName, String email, String telephoneNumber){
        return new Donation.Builder().setDonationId(donationId)
                .setDonorName(donorName)
                .setEmail(email)
                .setTelephoneNumber(telephoneNumber)
                .build();
    }
}
