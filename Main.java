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
		list.addObjectAtEnd(first);
		list.addObjectAtEnd(second);
		list.addObjectAtEnd(third);
		list.addObjectAtEnd(fourth);
		list.addObjectAtEnd(fivth);
		list.addObjectAtStart(sixth);
		list.printList();
		System.out.println("Length of list: " + list.getLengthOfList());
		
		list.deleteObjectAtStart();
		System.out.println();
		list.printList();
		System.out.println("Length of list: " + list.getLengthOfList());
		
		list.deleteObjectAtEnd();
		System.out.println();
		list.printList();
		System.out.println("Length of list: " + list.getLengthOfList());
		
		ListObject search = new ListObject("Third");
		ListObject search2 = new ListObject(20);
		list.searchList(search);
		list.searchList(search2);
		list.searchList(fourth);
	}

	
}
