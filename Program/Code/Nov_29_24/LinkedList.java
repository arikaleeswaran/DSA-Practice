package Nov_29_24;

public class LinkedList {

    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    LinkedList(){
        head = null;
    }

    public void insertAtBig(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
        }else{
            newNode .next = head;
            head = newNode;
        }
    }

    public void display(){
        Node temp = head;
        if(head == null){
//            throw new Exception("List i sempty!");
        }else{
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null){
            insertAtBig(data);
        }else{
            while(temp.next != null){
                temp = temp.next;
            }
        }
        newNode.next = temp.next;
        temp.next= newNode;
    }

    public void insertAtpos(int pos, int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(pos == 0){
            newNode.next = head;
            head = newNode;
        }else{
            for(int i=1;i<pos;i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }




}
