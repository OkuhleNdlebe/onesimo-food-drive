package za.ac.cput.group6.Repository.DonationType;

import za.ac.cput.group6.Entity.DonationType;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IDonationTypeRepository extends IRepository<DonationType, String> {
    public Set<DonationType> getAll();
}
