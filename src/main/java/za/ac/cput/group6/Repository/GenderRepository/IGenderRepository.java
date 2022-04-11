package za.ac.cput.group6.Repository.GenderRepository;

import za.ac.cput.group6.Entity.Gender;
import za.ac.cput.group6.Repository.IRepository;

import java.util.Set;

public interface IGenderRepository extends IRepository <Gender,String> {


    public Set<Gender> getAll();
}


