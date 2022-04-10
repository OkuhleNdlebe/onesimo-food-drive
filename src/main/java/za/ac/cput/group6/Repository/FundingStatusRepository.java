package za.ac.cput.group6.Repository;

import za.ac.cput.group6.Entity.FundingStatus;
import java.util.HashSet;
import java.util.Set;

public class FundingStatusRepository implements IFundingStatusRepository{

    private static FundingStatusRepository  repository = null;
    private Set<FundingStatus> fundingStatusDB = null;
    private FundingStatusRepository() {
        fundingStatusDB = new HashSet<FundingStatus>();
    }
    public static FundingStatusRepository getRepository(){
        if (repository == null){
            repository = new FundingStatusRepository();
        }
        return repository;
    }

    @Override
    public FundingStatus create(FundingStatus fundingStatus) {
        boolean success = fundingStatusDB.add(fundingStatus);
        if(!success)
            return null;
        return fundingStatus;
    }

    @Override
    public FundingStatus read(String fundingStatusId) {
        for (FundingStatus b : fundingStatusDB)
            if (b.getStudentID().equals(b.getStudentID())){
                return b;
            }
        return null;
    }
    @Override
    public FundingStatus update(FundingStatus fundingStatus) {
        FundingStatus oldFundingStatus = read(fundingStatus.getStudentID());
        if (oldFundingStatus != null){
            fundingStatusDB.remove(oldFundingStatus);
            fundingStatusDB.add(fundingStatus);
            return fundingStatus;
        }
        return null;
    }
    @Override
    public boolean delete(String studentID) {
        FundingStatus FundingStatusToDelete = read(studentID);
        if (FundingStatusToDelete== null)

            return false;
        fundingStatusDB.remove(FundingStatusToDelete);
        return  true;
    }
    @Override
    public Set<FundingStatus> getAll() {
        return fundingStatusDB;
    }
}
