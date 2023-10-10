package linkedlist;

public class SriLinkedList {
	
	Node head;
	int size=0;
	
	public void addNode(int data) {
		Node node = new Node();
		node.data=data;
		node.next=null;
		
		if(head==null) {
			head=node;
			size++;
		}else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
				size++;
			}
			n.next=node;
			size++;
		}
	}
	
	public void displayNodes() {
		Node node = head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	public int nodeSize() {
		return size;
	}

}
