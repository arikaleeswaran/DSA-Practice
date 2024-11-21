package Nov_13_24;

public class EquilibriumPoint {
    // Function to find the equilibrium point in the array.
    public static int equilibriumPoint(int arr[]) {
        int lsum = 0;
        int rsum = 0;
        for (int n : arr) {
            lsum += n;
        }
        for (int i = 0; i < arr.length; i++) {
            lsum -= arr[i];
            if (lsum == rsum) {
                return i + 1; // 1-based index
            }
            rsum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 2, 2};
        System.out.println("Equilibrium point: " + equilibriumPoint(arr1)); // Output: 3

        int[] arr2 = {1};
        System.out.println("Equilibrium point: " + equilibriumPoint(arr2)); // Output: 1

        int[] arr3 = {1, 2, 3};
        System.out.println("Equilibrium point: " + equilibriumPoint(arr3)); // Output: -1
    }
}
