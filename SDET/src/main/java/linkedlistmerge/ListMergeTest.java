package linkedlistmerge;

import org.junit.Test;

public class ListMergeTest {
	
	@Test
	public void testData1() {
		ListNode list1 = new ListNode(1);
	    list1.next = new ListNode(2);
	    list1.next.next = new ListNode(4);
	    
	    
	    ListNode list2 = new ListNode(1);
	    list2.next = new ListNode(3);
	    list2.next.next = new ListNode(4);
	   

	    // Merge the two sorted lists
	    MergeTwoSortedLists merger = new MergeTwoSortedLists();
	    ListNode mergedList = merger.mergeTwoLists(list1, list2);

	    // Print the merged list
	    while (mergedList != null) {
	        System.out.print(mergedList.val + " ");
	        mergedList = mergedList.next;
	    }
	}

}
