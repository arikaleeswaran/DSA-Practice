import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KLargest {

    static List<Integer> kLargest(int arr[], int k) {
        List<Integer> lst = new ArrayList<>();
        Arrays.sort(arr);
        int l = arr.length;
        int i = 1;
        while (i <= k) {
            lst.add(arr[l - i]);
            i++;
        }
        return lst;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 3;

        List<Integer> result = kLargest(arr, k);

        System.out.println("The " + k + " largest elements are: " + result);
    }
}
