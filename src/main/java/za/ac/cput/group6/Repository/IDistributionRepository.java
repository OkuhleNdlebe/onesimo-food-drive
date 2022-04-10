package za.ac.cput.group6.Repository;

import za.ac.cput.group6.Entity.Distribution;

import java.util.Set;

public interface IDistributionRepository extends IRepository<Distribution,String>{
    public Set<Distribution> getAll();
}
