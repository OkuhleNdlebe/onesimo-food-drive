package za.ac.cput.group6.Repository.Donor.impl;

import za.ac.cput.group6.Entity.Donor;
import za.ac.cput.group6.Repository.Donor.IDonorRepository;

import java.util.HashSet;
import java.util.Set;

public class DonorRepository implements IDonorRepository  {
    private static DonorRepository repository = null;
    private Set<Donor> donorDB = null;
    private DonorRepository () {
        donorDB = new HashSet<Donor>();
    }

    public static DonorRepository getRepository(){
        if (repository == null){
            repository = new DonorRepository();
        }
        return repository;
    }

    @Override
    public Donor create(Donor donor) {
        boolean success = donorDB.add(donor);
        if(!success)
            return null;
        return donor;
    }

    @Override
    public Donor read(String donorId) {
        for (Donor c : donorDB)
            if (c.getDonorId().equals(donorId)){
                return c;
            }
        return null;
    }
    @Override
    public Donor update(Donor donor) {
        Donor oldDonor = read(donor.getDonorId());
        if (oldDonor != null){
            donorDB.remove(oldDonor);
            donorDB.add(donor);
            return donor;
        }
        return null;
    }
    @Override
    public boolean delete(String donorId) {
        Donor DonorToDelete = read(donorId);
        if (DonorToDelete== null)

            return false;
        donorDB.remove(DonorToDelete);
        return  true;
    }
    @Override
    public Set<Donor> getAll() {
        return donorDB;
    }

}
