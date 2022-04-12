package za.ac.cput.group6.Repository.ParcelStore.impl;

import za.ac.cput.group6.Entity.ParcelStore;
import za.ac.cput.group6.Repository.ParcelStore.IParcelStoreRepository;

import java.util.HashSet;
import java.util.Set;

public class ParcelStoreRepository implements IParcelStoreRepository {
    private static ParcelStoreRepository repository = null;
    private Set<ParcelStore> parcelStoreDB = null;
    private ParcelStoreRepository() {
        parcelStoreDB = new HashSet<ParcelStore>();
    }
    public static ParcelStoreRepository getRepository(){
        if (repository == null){
            repository = new ParcelStoreRepository();
        }
        return repository;
    }

    @Override
    public ParcelStore create(ParcelStore parcelStore) {
        boolean success = parcelStoreDB.add(parcelStore);
        if(!success)
            return null;
        return parcelStore;
    }

    @Override
    public ParcelStore read(String parcelStoreId) {
        for (ParcelStore b : parcelStoreDB)
            if (b.getParcelStoreId().equals(b.getParcelStoreId())){
                return b;
            }
        return null;
    }
    @Override
    public ParcelStore update(ParcelStore parcelStore) {
        ParcelStore oldParcelStore = read(parcelStore.getParcelStoreId());
        if (oldParcelStore != null){
            parcelStoreDB.remove(oldParcelStore);
            parcelStoreDB.add(parcelStore);
            return parcelStore;
        }
        return null;
    }
    @Override
    public boolean delete(String parcelStoreId) {
        ParcelStore ParcelStoreToDelete = read(parcelStoreId);
        if (ParcelStoreToDelete== null)

            return false;
        parcelStoreDB.remove(ParcelStoreToDelete);
        return  true;
    }
    @Override
    public Set<ParcelStore> getAll() {
        return parcelStoreDB;
    }

}
