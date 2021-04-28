package services.Abstract.Concrete;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import entities.Instrocter;
import services.Abstract.IInstrocterService;

public class InstrocterManager implements IInstrocterService{
	Scanner scan = new Scanner(System.in);
	List<Instrocter> instrocters = new ArrayList<Instrocter>();

	@Override
	public void Get(int id) {
		System.out.println(instrocters.get(id-1));
		
	}

	@Override
	public void GetAll() {
		instrocters.forEach(i->{
			System.out.println(i.getName());
		});
		
		
	}

	@Override
	public void Add(Instrocter object) {
		instrocters.add(object);
		System.out.println(object.getName()+" added to among ınstrocters.");
		
	}

	@Override
	public void Update(Instrocter object) {
		System.out.print("Please enter the new name of the Instrocter :");
		object.setName(scan.nextLine());
		System.out.print("Please enter the new department name :");
		object.setDepartment(scan.nextLine());
		
	}

	@Override
	public void Delete(Instrocter object) {
		instrocters.remove(object.getId()-1);
		System.out.println(object.getName()+" has been removed among the instrocters!");
		
	}

}
