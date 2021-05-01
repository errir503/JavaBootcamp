


import Bussines.Concrete.CategoryManager;
import Bussines.Concrete.CourseManager;
import Bussines.Concrete.InstrocterManager;
import Bussines.Concrete.StudentManager;
import entities.Category;
import entities.Course;
import entities.Instrocter;
import entities.Student;

public class Main {
	public static void main(String[] args) {
		
		
		CategoryManager categoryManager= new CategoryManager();
		categoryManager.add(new Category(1,"Java"));
		categoryManager.add(new Category(2,"Python"));
		categoryManager.add(new Category(3,"C#"));
		
		
		System.out.println(categoryManager.get(0).getName());
		
		System.out.println("Tüm Kategoriler !");
	 categoryManager.getAll().forEach(i->{
		 System.out.println(i.getName());
	 });;
		
		
		
		InstrocterManager instrocterManager = new InstrocterManager();
		instrocterManager.add(new Instrocter(1,"Engin","Demiroğ","Founder @ Kodlama.io, Co-Founder @ SolidTeam & DevArchitecture, Instructor and Lifetime Learner"));
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.add(new Course(1,"Java & React",1,1,1));
		courseManager.add(new Course(2,"C# & Angular",1,0,2));
	
		Student student1= new Student(1, "Muharrem","Candan", "2121", 120);
		Student student2= new Student(2, "Yaren Nur", "Solmaz", "1212", 150);
		
		
		StudentManager studentManager = new StudentManager(student1);
		
		studentManager.add(student1);
		studentManager.add(student2);
		System.out.println(studentManager.get(1).getBalance());
		
		studentManager.buyACourse(courseManager.get(1),studentManager.get(2));
		
		
		System.out.println(studentManager.get(1).getBalance());
		
	/*	ArrayList<String> sehirler = new ArrayList<String>();
		sehirler.add("yaren");
		sehirler.add("müko");
		
		System.out.println(sehirler.get(0));
		*/
		

	}

}
