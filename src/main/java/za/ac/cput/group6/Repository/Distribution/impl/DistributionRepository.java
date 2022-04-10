package za.ac.cput.group6.Repository.Distribution.impl;

import za.ac.cput.group6.Entity.Distribution;
import za.ac.cput.group6.Repository.Distribution.IDistributionRepository;

import java.util.HashSet;
import java.util.Set;

public class DistributionRepository implements IDistributionRepository {
    private static DistributionRepository  repository = null;
    private Set<Distribution>distributionsDB = null;
    private DistributionRepository() {
        distributionsDB = new HashSet<Distribution>();
    }

    public static DistributionRepository getRepository(){
        if (repository == null){
            repository = new DistributionRepository();
        }
        return repository;
    }

    @Override
    public Distribution create(Distribution distribution) {
        boolean success = distributionsDB.add(distribution);
        if(!success)
            return null;
        return distribution;
    }

    @Override
    public Distribution read(String distributionId) {
        for (Distribution c : distributionsDB)
            if (c.getDistributionId().equals(distributionId)){
                return c;
            }
        return null;
    }
    @Override
    public Distribution update(Distribution distribution) {
        Distribution oldDistribution = read(distribution.getDistributionId());
        if (oldDistribution != null){
            distributionsDB.remove(oldDistribution);
            distributionsDB.add(distribution);
            return distribution;
        }
        return null;
    }
    @Override
    public boolean delete(String distributionId) {
        Distribution DistributionToDelete = read(distributionId);
        if (DistributionToDelete== null)

            return false;
        distributionsDB.remove(DistributionToDelete);
        return  true;
    }
    @Override
    public Set<Distribution> getAll() {
        return distributionsDB;
    }
}
