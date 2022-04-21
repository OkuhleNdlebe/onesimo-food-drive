package za.ac.cput.group6.Repository.Distribution;



import za.ac.cput.group6.Entity.Distribution;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IDistributionRepository extends IRepository<Distribution,String> {
    public Set<Distribution> getAll();
}
