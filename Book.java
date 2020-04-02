package Sorted_SLL;

public class Book extends Medium {
	
	//Attributes
	
	private String author;
	
	
	//Constructor - parameterized
	public Book(String title, String author, double price) {
		super.setTitle(title);
		super.setPrice(price(price));
		this.author = author;

	}
	
	//Constructor - default
	public Book() {
		super();
		
	}
	
	
	//Getters and Setters
	
	@Override
	public String getType() {
		return "Book";
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	//Override Interface and superclass methods
	
	@Override
	public double price(double price) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	public String toString() {
		return getType() + " " + super.toString() + "[author=" + author + "]";
	}
	

}
