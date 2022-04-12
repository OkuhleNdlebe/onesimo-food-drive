package za.ac.cput.group6.Repository.ParcelStore;

import za.ac.cput.group6.Entity.ParcelStore;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IParcelStoreRepository extends IRepository<ParcelStore,String> {
    public Set<ParcelStore> getAll();
}
