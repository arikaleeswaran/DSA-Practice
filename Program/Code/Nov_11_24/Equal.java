package Nov_11_24;

import java.util.Arrays;

public class Equal {
    public static boolean check(int[] arr1, int[] arr2) {
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare elements of both arrays
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Example test cases
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {4, 3, 2, 1};
        int[] array3 = {1, 2, 3, 5};

        // Test 1
        System.out.println("Are array1 and array2 equal? " + check(array1, array2)); // true

        // Test 2
        System.out.println("Are array1 and array3 equal? " + check(array1, array3)); // false
    }
}
