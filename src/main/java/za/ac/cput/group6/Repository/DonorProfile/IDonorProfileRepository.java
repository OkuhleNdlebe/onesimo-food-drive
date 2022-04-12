package za.ac.cput.group6.Repository.DonorProfile;

import za.ac.cput.group6.Entity.DonorProfile;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IDonorProfileRepository extends IRepository<DonorProfile,String> {
    public Set<DonorProfile> getAll();
}
