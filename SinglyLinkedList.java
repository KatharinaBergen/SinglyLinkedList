
public class SinglyLinkedList {

	private ListObject startObject = null;
	

	//Constructors
	
	public SinglyLinkedList() {
		
	}
	
	public SinglyLinkedList(ListObject object) {
		this.startObject = null;
	}
	
	
	//Setters and Getters
	
	public ListObject getStartObject() {
		return startObject;
	}

	public void setStartObject(ListObject startObject) {
		this.startObject = startObject;
	}

	
	//Methods
	
	public int getLengthOfList() {
		int lengthOfList = 0;
		
		if (startObject.getNext() != null) {
			ListObject currentObject = startObject.getNext();
			lengthOfList += 2;
			while (currentObject.getNext() != null && currentObject.getNext().getObject() != null) {
				currentObject = currentObject.getNext();
				lengthOfList++;
			}
		}
		return lengthOfList;
	}
	
	public void addObjectAtStart(ListObject object) {
		
		if(startObject == null) {
			this.setStartObject(object);
		}
		else {
			ListObject temporary = getStartObject();
			this.setStartObject(object);
			this.getStartObject().setNext(temporary);
		}
	}
	

	public void addObjectAtEnd(ListObject object) {
		
		if(startObject == null) {
			this.setStartObject(object);	
		}
		if(startObject.getNext() == null) {
			startObject.setNext(object);	
		}
		else {
			ListObject currentObject = startObject.getNext();
			if (currentObject.getNext() == null) {
				currentObject.setNext(object);
			}
			else {
				while (currentObject.getNext() != null) {
				currentObject = currentObject.getNext();
				}
				currentObject.setNext(object);
			}
		}
	}
	
	
	public void deleteObjectAtStart() {
		
		if(startObject == null) {
			;
		}
		else {
			this.setStartObject(getStartObject().getNext());
		}
	}
	
	
	public void deleteObjectAtEnd() {
		
		if(startObject == null) {
			;
		}
		else {
			ListObject currentObject = startObject;
			while (currentObject.getNext() != null) {
				currentObject = currentObject.getNext();
			}
			currentObject.setObject(null);
		}
	}
	
	public SinglyLinkedList reverseList() {
		
		SinglyLinkedList reversedList = new SinglyLinkedList();
		
		ListObject currentObjectOriginalList = new ListObject(getStartObject());
		ListObject currentObject = new ListObject(getStartObject());
		
		reversedList.addObjectAtStart(currentObject);
		
		if (currentObjectOriginalList.getNext() == null) {
			currentObjectOriginalList.setNext(getStartObject().getNext());
		}
		while (currentObjectOriginalList.getNext() != null) {
			currentObjectOriginalList = currentObjectOriginalList.getNext();
			currentObject = new ListObject(currentObjectOriginalList);
			reversedList.addObjectAtStart(currentObject);
		}
		return reversedList;
	}
	
	
	public int searchList(ListObject object) {
		int index = 0;
		ListObject currentObject = startObject;
		while (index < getLengthOfList()) {
			if(object.getObject() == currentObject.getObject()) {
				break;
			}
			else {
				index++;
				currentObject = currentObject.getNext();
			}
		}
		return index;
	}
	
	public void printList(OutputHandler handler) {
			
			ListObject object = getStartObject();
			
			if (getLengthOfList() == 0) {
				handler.handleLine("The list is empty");
			}
			else {
				do {
					handler.handleLine(object.toString());
					object = object.getNext();
				} 
				while (object.getNext() != null && object.getNext().getObject() != null);
				handler.handleLine(object.toString());
			}
	}
}
	
	
