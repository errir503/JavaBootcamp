package kodlamaio.nothwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.nothwind.business.abstracts.ProductService;
import kodlamaio.nothwind.dataAccess.abstracts.ProductDao;
import kodlamaio.nothwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {
	private ProductDao productDao;

	@Autowired // arada class yok onu oluşturur spring oluşturur
	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAll() {

		return this.productDao.findAll();
	}

}
