package kodlamaio.nothwind.business.abstracts;
import java.util.List;

import kodlamaio.nothwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();

}
