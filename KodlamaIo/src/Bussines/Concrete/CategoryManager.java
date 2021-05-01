package Bussines.Concrete;

import java.util.ArrayList;
import java.util.Scanner;

import Bussines.Abstract.ICategoryService;

import java.util.List;

import entities.Category;

public class CategoryManager implements ICategoryService {	
	
	Scanner scan = new Scanner(System.in);
	List<Category> categories = new ArrayList<Category>();

	@Override
	public void add(Category object) {
		categories.add(object);
		System.out.println(object.getName()+" category has been added!");

	}

	@Override
	public void update(Category object) {
		System.out.print("Please enter the new name of the Category :");
		object.setName(scan.nextLine());

	}

	@Override
	public void delete(Category category) {
		categories.remove(category.getId()-1);
		System.out.println(category.getName()+" category has been removed!");
	}

	@Override
	public Category get(int id) {
		
		return categories.get(id);
		
	}

	@Override
	public List<Category> getAll() {
		 return categories.subList(0, categories.size()); 
	}

}
