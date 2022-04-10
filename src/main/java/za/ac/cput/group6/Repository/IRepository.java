package za.ac.cput.group6.Repository;

<<<<<<< HEAD
public interface IRepository<T,ID>{
    public T create(T t);
    public T read(ID id);
    public T update(T t);
    boolean delete(ID id);
}
=======


//EntityType is the type
//ID is the datatype of the EntityType
    @Deprecated
    public interface IRepository<EntityType, ID> {
        EntityType create(EntityType t);

        EntityType read(ID id);

        EntityType update(EntityType t);

        boolean delete(ID id);

}
>>>>>>> ad7b730791ffe22576a857fb7a4eca45f4b2f123
