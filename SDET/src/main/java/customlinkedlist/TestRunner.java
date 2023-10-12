package customlinkedlist;

import org.junit.Test;

public class TestRunner {
    @Test
    public void testData(){
        LinkedList list = new LinkedList();
        list.addNode(1);
        list.addNode(3);
        list.addNode(5);
        list.addNode(7);
        list.displayNode();
        System.out.println(list.size);
        list.addNodeAtBeginning(4);
        list.displayNode();
        System.out.println(list.size);
        list.addNodeAtPosition(0,2);
        list.addNodeAtPosition(list.size-1,9);
        list.displayNode();
        System.out.println(list.size);
        list.deleteAt(4);
        list.displayNode();
        System.out.println(list.size);
    }
}
