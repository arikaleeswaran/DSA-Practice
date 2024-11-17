import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        List<Integer> lst = new ArrayList<>();
        while (head != null) {
            lst.add(head.val);
            head = head.next;
        }
        int l = 0;
        int r = lst.size() - 1;
        while (l < r && lst.get(l).equals(lst.get(r))) {
            l++;
            r--;
        }
        return l >= r;
    }

    public static void main(String[] args) {
        ListNode head = createLinkedList(new int[]{1, 2, 2, 1});
        Palindrome solution = new Palindrome();
        System.out.println(solution.isPalindrome(head));

        head = createLinkedList(new int[]{1, 2, 3});
        System.out.println(solution.isPalindrome(head));
    }

    private static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
}
