package Nov_13_24;

public class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int k = 10;
        BinarySearch sol = new BinarySearch();
        System.out.println("Element " + k + " is at index: " + sol.binarysearch(arr, k)); // Output: 3

        int[] arr2 = {1, 5, 8, 12, 20, 30};
        int k2 = 15;
        System.out.println("Element " + k2 + " is at index: " + sol.binarysearch(arr2, k2)); // Output: -1
    }
}
