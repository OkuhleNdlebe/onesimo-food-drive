package za.ac.cput.group6.Repository;




//EntityType is the type
//ID is the datatype of the EntityType
    @Deprecated
    public interface IRepository<EntityType, ID> {
    EntityType create(EntityType t);

    EntityType read(ID id);

    EntityType update(EntityType t);

    boolean delete(ID id);
}


