package services.Abstract;


public interface BaseService<T> {
	public void Get(int id);
	public void GetAll();
	public void Add(T object);
	public void Update(T object);
	public void Delete(T object);
	

}
