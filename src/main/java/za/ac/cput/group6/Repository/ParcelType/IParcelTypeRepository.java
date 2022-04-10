package za.ac.cput.group6.Repository.ParcelType;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */

import za.ac.cput.group6.Entity.ParcelType;
import za.ac.cput.group6.Repository.IRepository;
import za.ac.cput.group6.Repository.ParcelStatus.IParcelStatusRepository;

import java.util.Set;

public interface IParcelTypeRepository extends IRepository<ParcelType, String> {
    public Set<ParcelType>getAll();
}
