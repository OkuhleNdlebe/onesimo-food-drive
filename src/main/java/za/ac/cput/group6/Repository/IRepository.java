package za.ac.cput.group6.Repository;

/*
 *Name: Okuhle
 * Surname: Ndlebe
 * Group Role: Group lead
 * Student number : 218338619
 * Date : 10 April 2022
 * Term one Assignment on Builder Pattern
 */

//EntityType is the type
//ID is the datatype of the EntityType
    @Deprecated
    public interface IRepository<EntityType, ID> {
        EntityType create(EntityType t);

        EntityType read(ID id);

        EntityType update(EntityType t);

        boolean delete(ID id);

}
