package Sorted_SLL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListObject first = new ListObject(1);
		ListObject second = new ListObject(2);
		ListObject third = new ListObject(3);
		ListObject fourth = new ListObject(4);
		ListObject fivth = new ListObject(5);
		ListObject sixth = new ListObject(6);
		ListObject zero = new ListObject(0);
		
		SinglyLinkedList list = new SinglyLinkedList();
		
		list.addObject(first);
		list.addObject(third);
		list.addObject(second);
		list.addObject(fivth);
	

		
		//create Book Objects and save references in ArrayList
		Medium medium = new Book("War and Peace", "Leo Tolstoi", 0d);
		list.addObject(medium);	
		medium = new Book("Crime and Punishment", "Fjodor Dostojewski", 60d);
		list.addObject(medium);			
		medium = new Book("The Bible", "Unknown", 3d);
		list.addObject(medium);	
		
		list.addObject(fourth);
		
		medium = new CD("The Kangaroo Chronicles", "Hörbuch Hamburg", "Marc-Uwe Kling", 3d);
		list.addObject(medium);	
		
		list.addObject(zero);
		list.addObject(sixth);
		
		medium = new CD("Hurra die Welt geht unter", "Vertigo Berlin", "KIZ", 60d);
		list.addObject(medium);	
		medium = new Magazine("New Eastern Europe", "Kolegium Europy Wschodniej", 50.98d);
		list.addObject(medium);	
		
		

		
		OutputHandler handler = new ConsoleOutputHandler();
		list.printList(handler);


	}
}
