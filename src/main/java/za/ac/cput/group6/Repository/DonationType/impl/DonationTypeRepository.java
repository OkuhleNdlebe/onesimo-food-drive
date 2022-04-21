package za.ac.cput.group6.Repository.DonationType.impl;

import za.ac.cput.group6.Entity.DonationType;
import za.ac.cput.group6.Repository.DonationType.IDonationTypeRepository;

import java.util.HashSet;
import java.util.Set;

public class DonationTypeRepository implements IDonationTypeRepository {
    private static DonationTypeRepository repository = null;
    private Set<DonationType> donationTypeDB = null;
    private DonationTypeRepository() {donationTypeDB = new HashSet<DonationType>();}

    public static DonationTypeRepository getRepository(){
        if (repository == null){
            repository = new DonationTypeRepository();
        }
        return repository;
}
@Override
public DonationType create(DonationType donationType){
        boolean success = donationTypeDB.add(donationType);
        if(!success)
            return null;
        return donationType;
}
@Override
    public DonationType read(String donationTypeId){
        for (DonationType c : donationTypeDB)
            if (c.getDonationTypeId().equals(donationTypeId)){
                return c;
            }
        return null;
}
@Override
    public DonationType update(DonationType donationType){
        DonationType oldDonationType = read(donationType.getDonationTypeId());
        if (oldDonationType != null){
            donationTypeDB.remove(oldDonationType);
            donationTypeDB.add(donationType);
            return donationType;
        }
        return null;
}
@Override
    public boolean delete(String donationTypeId){
        DonationType DonationTypeToDelete = read(donationTypeId);
        if (DonationTypeToDelete == null)
            return false;
        donationTypeDB.remove(DonationTypeToDelete);
        return true;
}
@Override
    public Set<DonationType> getAll(){ return donationTypeDB;}
}