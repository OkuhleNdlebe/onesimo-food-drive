package za.ac.cput.group6.Repository;

import za.ac.cput.group6.Entity.ParcelRequest;

import java.util.Set;

public interface IParcelRequestRepository extends IRepository<ParcelRequest, String>{
    public Set<ParcelRequest> getAll();
}
