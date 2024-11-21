package Nov_19_24;

import java.util.Arrays;

public class LongestSub {
    public int findLongestConseqSubseq(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int maxm = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                continue;
            } else if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else {
                maxm = Math.max(maxm, count);
                count = 1;
            }
        }
        maxm = Math.max(maxm, count);
        return maxm;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 3, 10, 4, 20, 2};
        LongestSub solution = new LongestSub();
        System.out.println("Length of the longest consecutive subsequence: " + solution.findLongestConseqSubseq(arr)); // Output: 4

        int[] arr2 = {36, 41, 56, 35, 44, 33, 34, 92, 43, 32};
        System.out.println("Length of the longest consecutive subsequence: " + solution.findLongestConseqSubseq(arr2)); // Output: 5
    }
}
