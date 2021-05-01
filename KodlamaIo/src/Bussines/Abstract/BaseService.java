package Bussines.Abstract;

import java.util.List;

public interface BaseService<T> {
	public T get(int id);
	public List<T> getAll();
	public void add(T object);
	public void update(T object);
	public void delete(T object);
	

}
