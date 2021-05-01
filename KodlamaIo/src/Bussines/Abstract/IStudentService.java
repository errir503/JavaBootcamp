package Bussines.Abstract;

import Bussines.Concrete.CourseManager;
import entities.Course;
import entities.Student;

public interface IStudentService extends BaseService<Student>{
	public void getCourses(CourseManager courseManager,Student student);
	public void buyACourse(Course course,Student student);

}
