import java.util.PriorityQueue;

public class KthSmall {
    public static int kthSmallest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("The " + k + "rd smallest element is: " + kthSmallest(arr, k)); // Output: 7

        int[] arr2 = {1, 2, 3, 4, 5, 6};
        int k2 = 2;
        System.out.println("The " + k2 + "nd smallest element is: " + kthSmallest(arr2, k2)); // Output: 2
    }
}
