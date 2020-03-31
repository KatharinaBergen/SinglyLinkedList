import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SinglyLinkedListTest {

	ListObject first = new ListObject("First");
	ListObject second = new ListObject("Second");
	ListObject third = new ListObject("Third");
	ListObject fourth = new ListObject(4);
	ListObject fivth = new ListObject(5);
	ListObject sixth = new ListObject(6);
	
	@Test
	void test0() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addObjectAtEnd(first);
		list.addObjectAtEnd(second);
		list.addObjectAtEnd(third);

		assertEquals(third, list.getEndObject());
	}

	@Test
	void test1() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addObjectAtEnd(first);
		list.addObjectAtEnd(second);
		list.addObjectAtEnd(third);

		assertEquals(first, list.getStartObject());
	}
	
	@Test
	void test2() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addObjectAtEnd(first);
		list.addObjectAtEnd(second);
		list.addObjectAtEnd(third);

		assertEquals(3, list.getLengthOfList());
	}
	
	@Test
	void test3() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addObjectAtEnd(first);
		list.addObjectAtEnd(second);
		list.addObjectAtEnd(third);
		list.addObjectAtEnd(fourth);
		list.addObjectAtEnd(fivth);
		list.addObjectAtStart(sixth);
		
		ListObject search = new ListObject("blub");

		assertEquals(6, list.searchList(search));
	}
	
	@Test
	void test4() {
		SinglyLinkedList list = new SinglyLinkedList();
		list.addObjectAtEnd(first);
		list.addObjectAtEnd(second);
		list.addObjectAtEnd(third);
		list.addObjectAtEnd(fourth);
		list.addObjectAtEnd(fivth);
		list.addObjectAtStart(sixth);
		
		ListObject search = new ListObject("Third");

		assertEquals(3, list.searchList(search));
	}
}
