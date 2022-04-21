package za.ac.cput.group6.Repository.Donation;

import za.ac.cput.group6.Entity.Donation;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IDonationRepository extends IRepository<Donation,String> {
    public Set<Donation> getAll();
}
