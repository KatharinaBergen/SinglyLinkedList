

public class ConsoleOutputHandler implements OutputHandler {
	
	SinglyLinkedList originalList = new SinglyLinkedList();
	
	@Override
	public void printList(SinglyLinkedList originalList) {
		
		ListObject object = originalList.getStartObject();
		
		if (originalList.getLengthOfList() == 0) {
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
