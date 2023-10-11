package linkedlistmiddle;

import org.junit.Test;

public class FindMiddleNode {
	
	@Test
	public void testData1() {
		
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        
        ListNode middle = MiddleOfLinkedList.findMiddle(head);

        if (middle != null) {
            System.out.println("The middle element is: " + middle.val);
        } else {
            System.out.println("The list is empty.");
        }
	}

}
