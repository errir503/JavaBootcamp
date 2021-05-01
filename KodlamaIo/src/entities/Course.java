package entities;

public class Course {

	private int id;
	private String name;
	private int instrocterId;
	private int price;
	private int categoryId;

	public Course(int id, String name,int instrocterId, int price, int categoryId) {
		super();
		this.id = id;
		this.name = name;
		this.instrocterId=instrocterId;
		this.price = price;
		this.categoryId = categoryId;
	}

	public int getInstructer() {
		return instrocterId;
	}

	public void setInstructer(int instrocterId) {
		this.instrocterId = instrocterId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
