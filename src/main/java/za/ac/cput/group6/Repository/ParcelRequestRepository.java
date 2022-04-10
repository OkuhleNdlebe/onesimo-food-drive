package za.ac.cput.group6.Repository;


import za.ac.cput.group6.Entity.ParcelRequest;
import java.util.HashSet;
import java.util.Set;

public class ParcelRequestRepository implements IParcelRequestRepository {
    private static ParcelRequestRepository  repository = null;
    private Set<ParcelRequest> parcelRequestDB = null;
    private ParcelRequestRepository() {
        parcelRequestDB = new HashSet<ParcelRequest>();
    }

    public static ParcelRequestRepository getRepository(){
        if (repository == null){
            repository = new ParcelRequestRepository();
        }
        return repository;
    }
    @Override
    public ParcelRequest create(ParcelRequest parcelRequest) {
        boolean success = parcelRequestDB.add(parcelRequest);
        if(!success)
            return null;
        return parcelRequest;
    }
    @Override
    public ParcelRequest read(String parcelRequestId) {
        for (ParcelRequest a : parcelRequestDB)
            if (a.getParcelRequestId().equals(parcelRequestId)){
                return a;
            }
        return null;
    }
    @Override
    public ParcelRequest update(ParcelRequest parcelRequest) {
        ParcelRequest oldParcelRequest = read(parcelRequest.getParcelRequestId());
        if (oldParcelRequest != null){
            parcelRequestDB.remove(oldParcelRequest);
            parcelRequestDB.add(parcelRequest);
            return parcelRequest;
        }
        return null;
    }


    @Override
    public boolean delete(String parcelRequestId) {
       ParcelRequest ParcelRequestToDelete = read(parcelRequestId);
        if (ParcelRequestToDelete== null)

            return false;
        parcelRequestDB.remove(ParcelRequestToDelete);
        return  true;
    }

    @Override
    public Set<ParcelRequest> getAll() {
        return parcelRequestDB;
    }
}
