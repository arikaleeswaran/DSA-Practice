// Definition for singly-linked list.
//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//}

public class LLRemoveEl {
    // Function to remove elements with the given value from the linked list
    public ListNode removeElements(ListNode head, int val) {
        ListNode dum = new ListNode(-1);
        dum.next = head; // Dummy node pointing to the head of the list
        ListNode prev = dum; // Previous pointer starts at dummy node
        ListNode cur = head; // Current pointer starts at head

        while (cur != null) {
            if (cur.val == val) {
                prev.next = cur.next; // Skip the current node
            } else {
                prev = cur; // Move prev pointer to current node
            }
            cur = cur.next; // Move to the next node
        }
        return dum.next; // Return the updated list, skipping dummy
    }

    // Main method for testing
    public static void main(String[] args) {
        LLRemoveEl solution = new LLRemoveEl();

        // Creating the linked list: 1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        int val = 6; // Value to remove
        System.out.println("Original list:");
        printList(head);

        // Remove elements with value `val`
        ListNode updatedHead = solution.removeElements(head, val);

        System.out.println("List after removing elements with value " + val + ":");
        printList(updatedHead);
    }

    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
