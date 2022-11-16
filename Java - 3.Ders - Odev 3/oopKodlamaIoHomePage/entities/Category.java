package oopKodlamaIoHomePage.entities;

public class Category {
	private int id;
	private String Categoryname;
	public Category() {
		super();
	}
	public Category(int id, String categoryname) {
		super();
		this.id = id;
		Categoryname = categoryname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryname() {
		return Categoryname;
	}
	public void setCategoryname(String categoryname) {
		Categoryname = categoryname;
	}
	

}
