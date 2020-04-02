package Sorted_SLL;

public class Medium extends ListObject {
	
	//Attributes
	private String title;
	private double price;

	//Constructor - parameterized
	public Medium(String title, double price) {
		super();
		this.title = title;
		this.price = price(price);
	}
	
	//Constructor - default
		public Medium() {
			super();
		}
	
	//Setter and Getter
	
	public String getType() {
		return null;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	
	
	//Overridden Methods 
	
	@Override
	public String toString() {
		return "[title=" + title + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Object newObject)  {
		
		int comparison = 0;
		
		if (newObject instanceof Medium && this instanceof Medium) {

			Medium o = (Medium) newObject;
					
			//priceComarison - compares price of this object to price of object o
			//returns -1 if o has lower price, 0 if o has same price, +1 if o has higher price
			comparison = (this.price < o.price ? -1 : (this.price == o.price ? 0 : 1));
			
			if(comparison == 0) {
				//titleComparison - compares title of this object to title of object o
				//returns negative int if o has lower price, 0 if o has same price, positive int if o has higher price
				int titleComparison = (this.title.compareToIgnoreCase(o.title));
				//sets title to -1 if negative, keeps 0 if 0, +1 if positive for value previously calculated
				comparison += (titleComparison < 0 ? -1 : (titleComparison == 0 ? 0 : 1));
			}
		}
		else {
			comparison = super.compareTo(newObject);
		}
		
		//returns sum, thus first sorting by priceComparison then by titleComparison
		return comparison;
	}
	

	public double price(double price) {
		// TODO Auto-generated method stub		
		return price;
	}
	

}
