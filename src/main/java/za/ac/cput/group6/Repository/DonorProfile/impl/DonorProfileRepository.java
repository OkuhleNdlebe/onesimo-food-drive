
package za.ac.cput.group6.Repository.DonorProfile.impl;
import za.ac.cput.group6.Entity.DonorProfile;
import za.ac.cput.group6.Repository.DonorProfile.IDonorProfileRepository;

import java.util.HashSet;
import java.util.Set;

public class DonorProfileRepository implements IDonorProfileRepository {
    private static DonorProfileRepository repository = null;
    private Set<DonorProfile> donorProfileDB = null;
    private DonorProfileRepository() {
        donorProfileDB = new HashSet<DonorProfile>();
    }

    public static DonorProfileRepository getRepository() {
        if (repository == null){
            repository = new DonorProfileRepository();
        }
        return repository;
    }

    @Override
    public DonorProfile create(DonorProfile donorProfile) {
        boolean success = donorProfileDB.add(donorProfile);
        if(!success)
            return null;
        return donorProfile;
    }

    @Override
    public DonorProfile read(String donorId) {
        for (DonorProfile b : donorProfileDB)
            if (b.getDonorId().equals(b.getDonorId())){
                return b;
            }
        return null;
    }

    @Override
    public DonorProfile update(DonorProfile donorProfile) {
        DonorProfile oldDonorProfile = read(donorProfile.getDonorId());
        if (oldDonorProfile != null){
            donorProfileDB.remove(oldDonorProfile);
            donorProfileDB.add(donorProfile);
            return donorProfile;
        }
        return null;
    }

    @Override
    public boolean delete(String donorId) {
        DonorProfile DonorProfileToDelete = read(donorId);
        if (DonorProfileToDelete == null)

            return false;
        donorProfileDB.remove(DonorProfileToDelete);
        return  true;
    }
    @Override
    public Set<DonorProfile> getAll() {
        return donorProfileDB;
    }


}
