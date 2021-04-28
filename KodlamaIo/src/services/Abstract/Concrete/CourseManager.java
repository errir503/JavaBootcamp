package services.Abstract.Concrete;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import entities.Course;
import services.Abstract.ICourseService;

public class CourseManager implements ICourseService {
	Scanner scan = new Scanner(System.in);
	List<Course> courses = new ArrayList<Course>();

	@Override
	public void Add(Course object) {
		courses.add(object);
		System.out.println(object.getName()+" course has been added!");

	}

	@Override
	public void Update(Course object) {
		System.out.print("Please enter the new name of the Course :");
		object.setName(scan.nextLine());

	}

	@Override
	public void Delete(Course category) {
		courses.remove(category.getId()-1);
		System.out.println(category.getName()+" course has been removed!");
	}

	@Override
	public void Get(int id) {
		System.out.println(courses.get(id-1));
		
	}

	@Override
	public void GetAll() {
		courses.forEach((i) ->{
			System.out.println(i.getName());
		});
	}

}
