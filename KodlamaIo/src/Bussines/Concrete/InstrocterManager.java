package Bussines.Concrete;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Bussines.Abstract.IInstrocterService;
import entities.Course;
import entities.Instrocter;

public class InstrocterManager implements IInstrocterService{
	Scanner scan = new Scanner(System.in);
	List<Instrocter> instrocters = new ArrayList<Instrocter>();

	@Override
	public Instrocter get(int id) {
		return instrocters.get(id-1);
		
	}

	@Override
	public List<Instrocter> getAll() {
		return instrocters.subList(0, instrocters.size()-1);
		
	}

	@Override
	public void add(Instrocter object) {
		instrocters.add(object);
		System.out.println(object.getName()+" added to among ınstrocters.");
		
	}

	@Override
	public void update(Instrocter object) {
		System.out.print("Please enter the new name of the Instrocter :");
		object.setName(scan.nextLine());
		System.out.print("Please enter the new department name :");
		object.setDepartment(scan.nextLine());
		
	}

	@Override
	public void delete(Instrocter object) {
		instrocters.remove(object.getId()-1);
		System.out.println(object.getName()+" has been removed among the instrocters!");
		
	}

	@Override
	public void addACourse(CourseManager courseManager,Course course) {
		courseManager.add(course);
		
	}

}
