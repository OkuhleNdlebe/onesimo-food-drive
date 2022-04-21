package za.ac.cput.group6.Repository.DonationType;
/*
Author: Xola Mngeni
Student number: 218268017
Date: 10 April 2022
ADP assignment 1
 */

import za.ac.cput.group6.Entity.DonationType;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IDonationTypeRepository extends IRepository<DonationType, String> {
    public Set<DonationType> getAll();
}
