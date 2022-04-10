package za.ac.cput.group6.Repository.ParcelRecord;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import za.ac.cput.group6.Entity.ParcelRecord;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IParcelRecordRepository extends IRepository<ParcelRecord, String> {
    public Set<ParcelRecord>getAll();
}
