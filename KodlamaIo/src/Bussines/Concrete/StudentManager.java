package Bussines.Concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Bussines.Abstract.IStudentService;
import entities.Course;
import entities.Student;

public class StudentManager implements IStudentService{
	Student _student;
	Scanner scan = new Scanner(System.in);
	List<Student> students = new ArrayList<Student>();
	
	public StudentManager(Student student) {
		_student = student;
	}
	
	@Override
	public Student get(int id) {
		
		return students.get(id-1);
	}

	@Override
	public List<Student> getAll() {
		return students.subList(0, students.size()-1);
		
	}

	@Override
	public void add(Student object) {
		students.add(object);
		System.out.println(object.getName()+" joined to system!");
		
	}

	@Override
	public void update(Student object) {
			
		
	}

	@Override
	public void delete(Student object) {
		students.remove(object.getId()-1);
		
	}

	@Override
	public void buyACourse(Course course,Student student) {
	    System.out.println(course.getName()+" aded to your account.");
	    _student.setBalance(_student.getBalance()-course.getPrice());
	    
	    
		
	}

	@Override
	public void getCourses(CourseManager courseManager,Student student) {
		
		
	}

}
