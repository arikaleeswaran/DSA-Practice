import java.util.ArrayList;

public class NextLarge {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> lst = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    max = arr[j];
                    break;
                }
            }
            lst.add(max);
        }
        return lst;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        NextLarge solution = new NextLarge();
        ArrayList<Integer> result = solution.nextLargerElement(arr);
        System.out.println("Next larger elements: " + result); // Output: [5, 10, 10, -1, -1]

        int[] arr2 = {13, 7, 6, 12};
        System.out.println("Next larger elements: " + solution.nextLargerElement(arr2)); // Output: [-1, 12, 12, -1]
    }
}
