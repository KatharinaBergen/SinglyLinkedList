package Sorted_SLL;

public class ListObject implements Comparable<Object>{

	private Object object;
	private ListObject next;
	
	
	//Constructor
	public ListObject(Object object) {
		this.object = object;
		this.next = null;
	}

	//Setters and Getters
	
	public ListObject getNext() {
		return next;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public void setNext(ListObject next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "" + object + "";
	}
	
	@Override
	public int compareTo(Object newObject) {
		int comparison = this.toString().compareToIgnoreCase(newObject.toString());
		
		//sets title to -1 if negative, keeps 0 if 0, +1 if positive for value previously calculated
		comparison = (comparison < 0 ? -1 : (comparison == 0 ? 0 : 1));
		
		return  comparison;
	}
	
}
