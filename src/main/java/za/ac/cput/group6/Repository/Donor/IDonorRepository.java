package za.ac.cput.group6.Repository.Donor;

import za.ac.cput.group6.Entity.Donor;
import za.ac.cput.group6.Repository.IRepository;
import java.util.Set;

public interface IDonorRepository extends IRepository<Donor,String> {
    public Set<Donor> getAll();
}
