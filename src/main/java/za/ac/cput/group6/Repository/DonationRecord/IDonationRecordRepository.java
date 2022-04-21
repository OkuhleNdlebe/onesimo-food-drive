package za.ac.cput.group6.Repository.DonationRecord;
/*
Author: Xola Mngeni
Student number: 218268017
Date: 10 April 2022
ADP assignment 1
 */

import za.ac.cput.group6.Entity.Donation;
import za.ac.cput.group6.Entity.DonationRecord;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IDonationRecordRepository extends IRepository<DonationRecord,String> {
    public Set<DonationRecord> getAll();
}
