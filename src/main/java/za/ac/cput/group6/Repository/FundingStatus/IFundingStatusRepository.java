package za.ac.cput.group6.Repository.FundingStatus;

import za.ac.cput.group6.Entity.FundingStatus;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IFundingStatusRepository extends IRepository<FundingStatus, String> {
    public Set<FundingStatus> getAll();
}
