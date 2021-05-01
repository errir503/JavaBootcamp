package Bussines.Concrete;
import java.util.ArrayList;
import java.util.Scanner;

import Bussines.Abstract.ICourseService;

import java.util.List;
import entities.Course;

public class CourseManager implements ICourseService {
	Scanner scan = new Scanner(System.in);
	List<Course> courses = new ArrayList<Course>();

	@Override
	public void add(Course object) {
		courses.add(object);
		System.out.println(object.getName()+" course has been added!");

	}

	@Override
	public void update(Course object) {
		System.out.print("Please enter the new name of the Course :");
		object.setName(scan.nextLine());

	}

	@Override
	public void delete(Course category) {
		courses.remove(category.getId()-1);
		System.out.println(category.getName()+" course has been removed!");
	}

	@Override
	public Course get(int id) {
		return courses.get(id-1);
		
	}

	@Override
	public List<Course> getAll() {
		return courses.subList(0, courses.size()-1);
	}

}
