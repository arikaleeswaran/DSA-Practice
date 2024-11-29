package Nov_29_24;

public class Demo {

    public static void main(String[] args) {
        LinkedList lst = new LinkedList();
        lst.insertAtBig(23);
        lst.insertAtBig(45);
        lst.insertAtBig(12);
        lst.insertAtEnd(1000);
        lst.insertAtEnd(34);

        lst.insertAtpos(2,999);
        lst.display();
    }
}
