package za.ac.cput.group6.Repository.ParcelPack.impl;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */

import za.ac.cput.group6.Entity.ParcelPack;
import za.ac.cput.group6.Repository.ParcelPack.IParcelPackRepository;
import java.util.*;
public class ParcelPackRepository implements IParcelPackRepository {


    private static ParcelPackRepository  repository = null;
    private Set<ParcelPack> parcelPackDB = null;
    private ParcelPackRepository() {
        parcelPackDB = new HashSet<ParcelPack>();
    }
    public static ParcelPackRepository getRepository(){
        if (repository == null){
            repository = new ParcelPackRepository();
        }
        return repository;
    }


    @Override
    public ParcelPack create(ParcelPack parcelPack) {
        boolean success = parcelPackDB.add(parcelPack);
        if(!success)
            return null;
        return parcelPack;
    }

    @Override
    public ParcelPack read(String parcelId) {
        for (ParcelPack b : parcelPackDB)
            if (b.getParcelRecordId().equals(b.getParcelRecordId())){
                return b;
            }
        return null;
    }
    @Override
    public ParcelPack update(ParcelPack parcelPack) {
        ParcelPack oldParcelPack = read(parcelPack.getParcelRecordId());
        if (oldParcelPack != null){
            parcelPackDB.remove(oldParcelPack);
            parcelPackDB.add(parcelPack);
            return parcelPack;
        }
        return null;
    }

    @Override
    public boolean delete(String parcelPackId) {
        ParcelPack ParcelPackToDelete = read(parcelPackId);
        if (ParcelPackToDelete== null)

            return false;
        parcelPackDB.remove(ParcelPackToDelete);
        return  true;
    }
    @Override
    public Set<ParcelPack> getAll() {
        return parcelPackDB;
    }
}
