import entities.Category;
import entities.Course;
import entities.Instrocter;
import services.Abstract.Concrete.CategoryManager;
import services.Abstract.Concrete.CourseManager;
import services.Abstract.Concrete.InstrocterManager;

public class Main {
	public static void main(String[] args) {
		
		
		//kategori ekleme -oluşturma -silme  
		Category computer= new Category(1 , "Computer");
		Category phone= new Category(2 , "Phone");
		Category tablet= new Category(3 , "Tablet");
		
		CategoryManager categoryManager = new CategoryManager();
		categoryManager.Add(computer);
		categoryManager.Add(tablet);
		categoryManager.Add(phone);	
		categoryManager.GetAll();
		
		categoryManager.Delete(computer);	
		categoryManager.Update(tablet);
		categoryManager.GetAll();
		
		System.out.println("+++++++++++++++++++");
		
		Course java = new Course(1,"Java",50);
		Course python = new Course(2,"Python",50);
		Course cSharp = new Course(3,"c#",50);
		
		CourseManager courseManager = new CourseManager();
		courseManager.Add(java);
		courseManager.Add(python);
		courseManager.Add(cSharp);
		
		courseManager.GetAll();
		
		courseManager.Delete(cSharp);
		courseManager.GetAll();
		
		System.out.println("+++++++++++++++++++");
		
		Instrocter instrocter1= new Instrocter(1,"Engin Demiroğlu","SoftwareDeveloper");
		Instrocter instrocter2= new Instrocter(2,"Mustafa Murat Coşkun","SoftwareDeveloper");
		
		InstrocterManager instrocterManager = new InstrocterManager();
		
		instrocterManager.Add(instrocter1);
		instrocterManager.Add(instrocter2);
		
		instrocterManager.GetAll();
		instrocterManager.Delete(instrocter2);
		
		instrocterManager.GetAll();

	}

}
