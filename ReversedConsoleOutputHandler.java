
public class ReversedConsoleOutputHandler implements OutputHandler {

	SinglyLinkedList originalList = new SinglyLinkedList();
	
	
	public SinglyLinkedList reverseList(SinglyLinkedList originalList) {
		
		SinglyLinkedList reversedList = new SinglyLinkedList();
		
		ListObject currentObjectOriginalList = new ListObject(originalList.getStartObject());
		ListObject currentObject = new ListObject(originalList.getStartObject());
		
		reversedList.addObjectAtStart(currentObject);
		
		if (currentObjectOriginalList.getNext() == null) {
			currentObjectOriginalList.setNext(originalList.getStartObject().getNext());
		}
		while (currentObjectOriginalList.getNext() != null) {
			currentObjectOriginalList = currentObjectOriginalList.getNext();
			currentObject = new ListObject(currentObjectOriginalList);
			reversedList.addObjectAtStart(currentObject);
			
		}
	
		return reversedList;
	}
	
	@Override
	public void printList(SinglyLinkedList originalList) {
		
		SinglyLinkedList reversedList = reverseList(originalList);
		
		ListObject object = reversedList.getStartObject();
		
		if (reversedList.getLengthOfList() == 0) {
			handleLine("The list is empty");
		}
		else {
			do {
				handleLine(object.toString());
				object = object.getNext();
			} 
			while (object.getNext() != null && object.getNext().getObject() != null);
			handleLine(object.toString());
		}
	}	
	
	@Override
	public void handleLine(String line) {				
		System.out.println(line);

	}

}
