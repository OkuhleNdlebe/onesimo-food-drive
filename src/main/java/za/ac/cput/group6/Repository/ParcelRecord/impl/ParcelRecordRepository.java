package za.ac.cput.group6.Repository.ParcelRecord.impl;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */

import za.ac.cput.group6.Entity.ParcelRecord;
import za.ac.cput.group6.Repository.ParcelRecord.IParcelRecordRepository;
import java.util.*;
public class ParcelRecordRepository implements IParcelRecordRepository {


    private static ParcelRecordRepository  repository = null;
    private Set<ParcelRecord> parcelRecordDB = null;
    private ParcelRecordRepository() {
        parcelRecordDB = new HashSet<ParcelRecord>();
    }
    public static ParcelRecordRepository getRepository(){
        if (repository == null){
            repository = new ParcelRecordRepository();
        }
        return repository;
    }


    @Override
    public ParcelRecord create(ParcelRecord parcelRecord) {
        boolean success = parcelRecordDB.add(parcelRecord);
        if(!success)
            return null;
        return parcelRecord;
    }

    @Override
    public ParcelRecord read(String parcelRecordId) {
        for (ParcelRecord b : parcelRecordDB)
            if (b.getParcelRecordId().equals(b.getParcelRecordId())){
                return b;
            }
        return null;
    }
    @Override
    public ParcelRecord update(ParcelRecord parcelRecord) {
        ParcelRecord oldParcelRecord = read(parcelRecord.getParcelRecordId());
        if (oldParcelRecord != null){
            parcelRecordDB.remove(oldParcelRecord);
            parcelRecordDB.add(parcelRecord);
            return parcelRecord;
        }
        return null;
    }
    @Override
    public boolean delete(String parcelRecordId) {
        ParcelRecord ParcelRecordToDelete = read(parcelRecordId);
        if (ParcelRecordToDelete== null)

            return false;
        parcelRecordDB.remove(ParcelRecordToDelete);
        return  true;
    }
    @Override
    public Set<ParcelRecord> getAll() {
        return parcelRecordDB;
    }

}
