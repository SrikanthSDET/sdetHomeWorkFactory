package customlinkedlist;

public class LinkedList {
    Node head;
    int size=0;
    class Node{
        int data;
        Node next;
        Node(int val){
            data=val;
            next=null;
        }
    }
    LinkedList(){
        head = null;
    }

    public void addNode(int val){
        Node newNode = new Node(val);
        if(head==null){
            head = newNode;
        }else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        size++;
    }

    public void addNodeAtBeginning(int val){
        Node newNode = new Node(val);
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
        size++;
    }

    public void addNodeAtPosition(int pos,int val){
        Node newNode = new Node(2);
        if(head==null){
            System.out.println("Index Outbound Exception");
        }else{
            Node current=head;
            for(int i=1;i<pos-1;i++){
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
        size++;
    }

    public void deleteAt(int pos){
        Node current = head;
        Node previous = null;
        for(int i=1;i<pos;i++){
            previous=current;
            current=current.next;
        }
        previous.next=current.next;
        size--;
    }

    public void displayNode(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data + " ");
            current=current.next;
        }
        System.out.println();
    }
    public int binaryListToInt() {
        int result = 0;
        int power = 0;
        Node current = head;

        while (current != null) {
            int bit = current.data;
            result += bit * Math.pow(2, power);
            power++;
            current = current.next;
        }

        return result;
    }

}
