package linkedlistmiddle;

public class MiddleOfLinkedList {
	public static ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
}
}
