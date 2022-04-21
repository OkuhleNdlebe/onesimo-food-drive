package za.ac.cput.group6.Repository.Donation.impl;
/*
Author: Xola Mngeni
Student number: 218268017
Date: 10 April 2022
ADP assignment 1
 */

import za.ac.cput.group6.Entity.Donation;
import za.ac.cput.group6.Repository.Donation.IDonationRepository;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.DoubleAccumulator;

public class DonationRepository implements IDonationRepository {
    private static DonationRepository repository = null;
    private Set<Donation>donationDB = null;
    private DonationRepository() {donationDB = new HashSet<Donation>();}

    public static DonationRepository getRepository(){
        if (repository == null){
            repository = new DonationRepository();
        }
        return repository;
    }
    @Override
    public Donation create(Donation donation){
        boolean success = donationDB.add(donation);
        if(success)
            return null;
        return donation;
    }
    @Override
    public Donation read(String donationId){
        for(Donation c : donationDB)
            if (c.getDonationId().equals(donationId)){
                return c;
            }
        return null;
    }
    @Override
    public Donation update(Donation donation){
        Donation oldDonation = read(donation.getDonationId());
        if(oldDonation != null){
            donationDB.remove(oldDonation);
            donationDB.add(donation);
            return donation;
        }
        return null;
    }
    @Override
    public boolean delete(String donationId){
        Donation DonationToDelete = read(donationId);
        if(DonationToDelete == null)
            return false;
        donationDB.remove(DonationToDelete);
        return true;
    }
    @Override
    public Set<Donation> getAll(){return donationDB;}
}
