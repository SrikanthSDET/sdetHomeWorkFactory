package linkedlist;

public class Executor {
	
	public static void main(String[] args) {
		SriLinkedList list = new SriLinkedList();
		list.addNode(7);
		list.addNode(16);
		list.addNode(25);
		
		list.displayNodes();
		
		System.out.println(list.nodeSize());
	}
	

}
