package oopIntro;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product(1, "Lenova v14", 1500, "16 GB RAM"); // referans oluşturma - intance oluşturma

		Product product2 = new Product(); // referans oluşturma - intance oluşturma
		product2.id = 2;
		product2.name = "Lenova v15";
		product2.unitPrice = 16000;
		product2.detail = "16 GB RAM";

		Product product3 = new Product(); // referans oluşturma - intance oluşturma
		product3.id = 3;
		product3.name = "Hp";
		product3.unitPrice = 19000;
		product3.detail = "32 GB RAM";

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.name);
		}

		Category category1 = new Category(1, "Computers");

		Category category2 = new Category(2, "Tablets");

		Category category3 = new Category(3, "Screens");
		Category[] categories = { category1, category2, category3 };
		System.out.println("***************");
		for (Category category : categories) {

			System.out.println(category.name);

		}
		System.out.println("***************");
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);

	}

}
