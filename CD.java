package Sorted_SLL;

public class CD extends Medium {

	//Attributes
	
	private String label; 
	private String artist;
	
	
	//Constructor - parameterized
	public CD(String title, String label, String artist, double price) {
		super(title,  price);
		
		this.label = label;
		this.artist = artist;
	}
	
	//Constructor - default
	public CD() {
		super();
	}
	
	
	//Getters and Setters
	
	@Override
	public String getType() {
		return "CD";
	}
	
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}	
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}	
	
	
	//Override Interface and superclass methods

	@Override
	public String toString() {
		return getType() + " " + super.toString() + "[label=" + label + ", artist=" + artist + "]";
	}
	
}
