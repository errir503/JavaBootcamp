package services.Abstract.Concrete;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.List;

import entities.Category;
import services.Abstract.ICategoryService;

public class CategoryManager implements ICategoryService {
	Scanner scan = new Scanner(System.in);
	List<Category> categories = new ArrayList<Category>();

	@Override
	public void Add(Category object) {
		categories.add(object);
		System.out.println(object.getName()+" category has been added!");

	}

	@Override
	public void Update(Category object) {
		System.out.print("Please enter the new name of the Category :");
		object.setName(scan.nextLine());

	}

	@Override
	public void Delete(Category category) {
		categories.remove(category.getId()-1);
		System.out.println(category.getName()+" category has been removed!");
	}

	@Override
	public void Get(int id) {
		System.out.println(categories.get(id-1));
		
	}

	@Override
	public void GetAll() {
		categories.forEach((i) ->{
			System.out.println(i.getName());
		});
	}

}
