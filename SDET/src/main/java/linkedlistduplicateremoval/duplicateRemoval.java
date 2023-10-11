package linkedlistduplicateremoval;

import org.junit.Test;



public class duplicateRemoval {
	
	@Test
	public void testData1() {
		CustomLinkedList list = new CustomLinkedList();
        list.addNode(1);
        list.addNode(1);
        list.addNode(2);
        list.addNode(3);
        list.addNode(3);
  

        System.out.println("Original Linked List:");
        list.display();

        list.removeDuplicates();

        System.out.println("Linked List with Duplicates Removed:");
        list.display();
	}

}
