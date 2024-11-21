package Nov_11_24;

import java.util.Arrays;

public class Triplet {
    public static boolean find3Numbers(int arr[], int n, int x) {
        Arrays.sort(arr);
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == x) return true;
                else if (sum < x) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 45, 6, 10, 8};
        int x = 22;
        int n = arr.length;

        Triplet solution = new Triplet();
        System.out.println(solution.find3Numbers(arr, n, x));

        int[] arr2 = {1, 2, 4, 3, 6};
        int x2 = 10;
        System.out.println(solution.find3Numbers(arr2, arr2.length, x2));
    }
}
