package za.ac.cput.group6.Repository.ParcelStatus.impl;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import  za.ac.cput.group6.Entity.ParcelStatus;
import za.ac.cput.group6.Repository.ParcelStatus.IParcelStatusRepository;

import java.util.HashSet;
import java.util.Set;

public class ParcelStatusRepository  implements IParcelStatusRepository {
    private static ParcelStatusRepository  repository = null;
    private Set<ParcelStatus> parcelStatusDB = null;
    private ParcelStatusRepository() {

        parcelStatusDB = new HashSet<ParcelStatus>();
    }
    public static ParcelStatusRepository getRepository(){
        if (repository == null){
            repository = new ParcelStatusRepository();
        }
        return repository;
    }

    @Override
    public ParcelStatus create(ParcelStatus parcelStatus) {
        boolean success = parcelStatusDB.add(parcelStatus);
        if(!success)
            return null;
        return parcelStatus;
    }

    @Override
    public ParcelStatus read(String parcelStatusId) {
        for (ParcelStatus b : parcelStatusDB)
            if (b.getParcelSatusId().equals(b.getParcelSatusId())){
                return b;
            }
        return null;
    }
    @Override
    public ParcelStatus update(ParcelStatus parcelStatus) {
        ParcelStatus oldParcelStatus = read(parcelStatus.getParcelSatusId());
        if (oldParcelStatus != null){
            parcelStatusDB.remove(oldParcelStatus);
            parcelStatusDB.add(parcelStatus);
            return parcelStatus;
        }
        return null;
    }
    @Override
    public boolean delete(String studentID) {
        ParcelStatus ParcelStatusToDelete = read(studentID);
        if (ParcelStatusToDelete== null)

            return false;
        parcelStatusDB.remove(ParcelStatusToDelete);
        return  true;
    }
    @Override
    public Set<ParcelStatus> getAll() {
        return parcelStatusDB;
    }

}
