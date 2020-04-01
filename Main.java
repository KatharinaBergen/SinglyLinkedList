public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListObject first = new ListObject("First");
		ListObject second = new ListObject("Second");
		ListObject third = new ListObject("Third");
		ListObject fourth = new ListObject(4);
		ListObject fivth = new ListObject(5);
		ListObject sixth = new ListObject(6);
		
		SinglyLinkedList list = new SinglyLinkedList();
		list.addObjectAtStart(first);
		list.addObjectAtEnd(second);
		list.addObjectAtEnd(third);
		list.addObjectAtEnd(fourth);
		list.addObjectAtEnd(fivth);
		list.addObjectAtEnd(sixth);
		list.getStartObject();
		
		
		System.out.println("\nORIGINAL LIST");
		OutputHandler handler = new ConsoleOutputHandler();
		list.printList(handler, list);
		
		System.out.println("\nREVERSED LIST");
		OutputHandler reverse = new ReversedConsoleOutputHandler();
		list.printList(reverse, list);
		
		System.out.println("Length of list: " + list.getLengthOfList());
		
		list.deleteObjectAtStart();
		System.out.println();

		System.out.println("Length of list: " + list.getLengthOfList());
		
		list.deleteObjectAtEnd();
		System.out.println();

		list.getLengthOfList();
		System.out.println("Length of list: " + list.getLengthOfList());
		
		System.out.println();
		ListObject search = new ListObject("Third");
		int index = list.searchList(search);
		
		if (index >= list.getLengthOfList()) {
			System.out.println("Your object is not in the list.");
		}
		else {
			System.out.println("The object was found at index " + index);
		}

	}

	
}
