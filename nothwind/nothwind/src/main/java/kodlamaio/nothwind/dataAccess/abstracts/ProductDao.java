package kodlamaio.nothwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.nothwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {// jparepository: Verilen veri tipi için , anatasyonu le süslenmiş
																		// entity için sorguları ona göre hazırlayayım
	

}
