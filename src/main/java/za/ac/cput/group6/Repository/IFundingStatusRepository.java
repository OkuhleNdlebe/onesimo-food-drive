package za.ac.cput.group6.Repository;

import za.ac.cput.group6.Entity.FundingStatus;

import java.util.Set;

public interface IFundingStatusRepository extends IRepository<FundingStatus, String> {
    public Set<FundingStatus> getAll();
}
