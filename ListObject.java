
public class ListObject {

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
	
	
}
