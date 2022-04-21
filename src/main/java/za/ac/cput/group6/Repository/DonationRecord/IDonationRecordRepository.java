package za.ac.cput.group6.Repository.DonationRecord;

import za.ac.cput.group6.Entity.Donation;
import za.ac.cput.group6.Entity.DonationRecord;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IDonationRecordRepository extends IRepository<DonationRecord,String> {
    public Set<DonationRecord> getAll();
}
