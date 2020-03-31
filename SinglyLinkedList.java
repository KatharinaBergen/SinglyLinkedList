
public class SinglyLinkedList {

	private ListObject startObject = null;
	private ListObject endObject = null;
	private int lengthOfList = 0;
	

	//Constructors
	
	public SinglyLinkedList() {
		
	}
	
	public SinglyLinkedList(ListObject object) {
		this.startObject = null;
		this.endObject = null;
		this.lengthOfList++;
	}
	
	
	//Setters and Getters
	
	public ListObject getEndObject() {
		return endObject;
	}

	public void setEndObject(ListObject endObject) {
		this.endObject = endObject;
	}
	
	public ListObject getStartObject() {
		return startObject;
	}

	public void setStartObject(ListObject startObject) {
		this.startObject = startObject;
	}
	
	public int getLengthOfList() {
		return lengthOfList;
	}
	
	
	//Methods
	
	public void addObjectAtStart(ListObject object) {
		
		if(startObject == null) {
			this.setEndObject(object);
			this.setStartObject(getEndObject());
		}
		else {
			ListObject temporary = getStartObject();
			this.setStartObject(object);
			this.getStartObject().setNext(temporary);
		}
		lengthOfList++;
	}
	

	public void addObjectAtEnd(ListObject object) {
		
		if(endObject == null) {
			this.setEndObject(object);
			this.setStartObject(object);
		}
		else {
			this.getEndObject().setNext(object);
			this.setEndObject(object);
		}
		lengthOfList++;
	}
	
	
	public void deleteObjectAtStart() {
		
		if(startObject == null) {
			;
		}
		else {
			this.setStartObject(getStartObject().getNext());
		}
		lengthOfList--;
	}
	
	
	public void deleteObjectAtEnd() {
		
		if(endObject == null) {
			;
		}
		else {
			ListObject object = startObject;
			while (object.getNext() != null) {
				this.setEndObject(object);	
				object = object.getNext();
			}
			object.setObject(null);
		}
		lengthOfList--;
	}
	
	
	public int searchList(ListObject object) {
		int index = 0;
		ListObject currentObject = startObject;
		while (index < getLengthOfList()) {
			if(object.getObject() == currentObject.getObject()) {
				System.out.println("Your search is completed. The object was found at index " + index);
				break;
			}
			else {
				index++;
				currentObject = currentObject.getNext();
			}
		
			if (index >= getLengthOfList()) {
				System.out.println("Your object is not in the list.");
			}
		}
		return index;
	}	
	
	
	public void printList() {
		ListObject object = startObject;
		if (getLengthOfList() == 0) {
			System.out.println("The list is empty");
		}
		else {
			do {
				System.out.println(object.toString());
				object = object.getNext();
			} 
			while (object.getNext() != null && object.getNext().getObject() != null);
			System.out.println(endObject.toString());
		}
	}
	
	
}
