package Sorted_SLL;

public class Magazine extends Medium {
	
	//Attributes
	
	private String publisher;

	
	//Constructor - parameterized
	public Magazine(String title, String publisher, double price) {
		super(title, price);
		this.publisher = publisher;
	}
	
	//Constructor - default
	public Magazine() {
		super();
	}
	
	
	//Getters and Setters
	
	@Override
	public String getType() {
		return "Magazine";
	}
	
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	} 
	
	
	//Override Interface and superclass methods

	@Override
	public String toString() {
		return getType() + " " + super.toString() + "[publisher=" + publisher + "]";
	}

}
