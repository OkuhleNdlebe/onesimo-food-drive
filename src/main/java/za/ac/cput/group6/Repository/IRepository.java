package za.ac.cput.group6.Repository;

public interface IRepository<T,ID>{
    public T create(T t);
    public T read(ID id);
    public T update(T t);
    boolean delete(ID id);
}