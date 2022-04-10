package za.ac.cput.group6.Repository.ParcelStatus;
/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */
import za.ac.cput.group6.Entity.ParcelStatus;
import java.util.Set;
import za.ac.cput.group6.Repository.IRepository;
public interface IParcelStatusRepository extends IRepository<ParcelStatus, String>  {
    public Set <ParcelStatus> getAll();

}
