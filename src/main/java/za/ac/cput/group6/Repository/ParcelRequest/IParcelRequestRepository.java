package za.ac.cput.group6.Repository.ParcelRequest;

import za.ac.cput.group6.Entity.ParcelRequest;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IParcelRequestRepository extends IRepository<ParcelRequest, String> {
    public Set<ParcelRequest> getAll();
}
