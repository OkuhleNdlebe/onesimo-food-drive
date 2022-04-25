package za.ac.cput.group6.Repository.DonationRecord.impl;
/*
Author: Xola Mngeni
Student number: 218268017
Date: 10 April 2022
ADP assignment 1
 */

import za.ac.cput.group6.Entity.DonationRecord;
import za.ac.cput.group6.Repository.DonationRecord.IDonationRecordRepository;

import java.util.HashSet;
import java.util.Set;

public class DonationRecordRepository implements IDonationRecordRepository {
    private static DonationRecordRepository repository = null;
    private Set<DonationRecord> donationRecordsDB = null;
    private DonationRecordRepository() {donationRecordsDB = new HashSet<DonationRecord>();}

    public static DonationRecordRepository getRepository(){
        if (repository == null){
            repository = new DonationRecordRepository();
        }
        return repository;
    }
    @Override
    public DonationRecord create(DonationRecord donationRecord){
        boolean success = donationRecordsDB.add(donationRecord);
        if(!success)
        return null;
        return donationRecord;
    }
    @Override
    public DonationRecord read(String donationRecordId){
        for (DonationRecord c : donationRecordsDB)
            if (c.getDonationRecordId().equals(donationRecordId)){
                return c;
            }
        return null;
    }
    @Override
    public DonationRecord update(DonationRecord donationRecord){
        DonationRecord oldDonationRecord = read(donationRecord.getDonationRecordId());
        if (oldDonationRecord != null){
            donationRecordsDB.remove(oldDonationRecord);
            donationRecordsDB.add(donationRecord);
            return donationRecord;
        }
        return null;
    }
    @Override
    public boolean delete(String donationRecordId) {
        DonationRecord DonationRecordToDelete = read(donationRecordId);
        if (DonationRecordToDelete == null)
            return false;
        donationRecordsDB.remove(DonationRecordToDelete);
        return true;
    }
    public Set<DonationRecord> getAll() {return donationRecordsDB;}
}
