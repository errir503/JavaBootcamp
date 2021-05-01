package Bussines.Abstract;

import Bussines.Concrete.CourseManager;
import entities.Course;
import entities.Instrocter;

public interface IInstrocterService extends BaseService<Instrocter> {

	public void addACourse(CourseManager courseManager,Course course);
}
