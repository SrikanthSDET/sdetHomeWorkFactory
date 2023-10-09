package october;

import java.util.LinkedList;

import org.junit.Test;

public class LinkedListImplementation<T> {

	public class ListNode {
		int value, size;
		ListNode next, head, tail, current;

		ListNode(int key) {
			this.value = key;
			this.next = null;
		}

		public ListNode addNode(int key) {
			ListNode node = new ListNode(key);
			return node;
		}

		public void addNodes(int value) {
			if (head == null) {
				head = tail = new ListNode(value);
			} else {
				tail = tail.next = new ListNode(value);
			}
			size++;
		}

		public int nodeSize() {
			return size;
		}

		public void removeNode(int index) {
			if(head==null) return;
			if (head.value == index) {
				head = head.next;
				size--;
			}
			current = head;
			while (current.next != null) {
				if (current.next.equals(value)) {
					current.next = current.next.next;
					size--;
				}
				current = current.next;
			}

		}
		
		public void removeAllNode() {
			if(head==null) return;
			while(head!=null && current.next.equals(value)) {
				head=head.next;
				size--;
			}
			current = head;
			while (current.next != null) {
				if (current.next.equals(value)) {
					current.next = current.next.next;
					size--;
				}
				current = current.next;
			}
			
		}
		
		public void displayNodes() {
	        ListNode current = head;
	        while (current != null) {
	            System.out.print(current.value + " -> ");
	            current = current.next;
	        }	        
	    }
		
		public void reverseList() {
			current=head;
			
		}

	}

	
	@Test
	public void testData1() {
		
		
		 
	}

}
