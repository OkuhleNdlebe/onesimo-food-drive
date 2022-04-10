package za.ac.cput.group6.Repository.ParcelPack;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import za.ac.cput.group6.Entity.ParcelPack;
import za.ac.cput.group6.Repository.IRepository;
import za.ac.cput.group6.Repository.ParcelPack.impl.ParcelPackRepository;

import java.util.Set;

public interface IParcelPackRepository extends IRepository<ParcelPack, String> {
    public Set <ParcelPack>getAll();
}
