package za.ac.cput.group6.Repository.ParcelType.impl;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import za.ac.cput.group6.Entity.ParcelType;
import java.util.*;

import za.ac.cput.group6.Repository.ParcelType.IParcelTypeRepository;

public class ParcelTypeRepository implements IParcelTypeRepository {


    private static ParcelTypeRepository  repository = null;
    private Set<ParcelType> parcelTypeDB = null;
    private ParcelTypeRepository() {
        parcelTypeDB = new HashSet<ParcelType>();
    }
    public static ParcelTypeRepository getRepository(){
        if (repository == null){
            repository = new ParcelTypeRepository();
        }
        return repository;
    }

    @Override
    public ParcelType create(ParcelType parcelType) {
        boolean success = parcelTypeDB.add(parcelType);
        if(!success)
            return null;
        return parcelType;
    }

    @Override
    public ParcelType read(String parcelTypeId) {
        for (ParcelType b : parcelTypeDB)
            if (b.getParcelTypeId().equals(b.getParcelTypeId())){
                return b;
            }
        return null;
    }
    @Override
    public ParcelType update(ParcelType parcelType) {
        ParcelType oldParcelType = read(parcelType.getParcelTypeId());
        if (oldParcelType != null){
            parcelTypeDB.remove(oldParcelType);
            parcelTypeDB.add(parcelType);
            return parcelType;
        }
        return null;
    }
    @Override
    public boolean delete(String parcelTypeId) {
        ParcelType ParcelTypeToDelete = read(parcelTypeId);
        if (ParcelTypeToDelete== null)

            return false;
        parcelTypeDB.remove(ParcelTypeToDelete);
        return  true;
    }
    @Override
    public Set<ParcelType> getAll() {
        return parcelTypeDB;
    }

}
