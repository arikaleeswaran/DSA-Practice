package Nov_13_24;

import java.util.HashSet;
import java.util.Set;

public class Union {
    public static int findUnion(int a[], int b[]) {
        Set<Integer> st = new HashSet<>();
        for (int n : a) {
            st.add(n);
        }
        for (int n : b) {
            st.add(n);
        }
        return st.size();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3};
        System.out.println("Size of union: " + findUnion(a, b)); // Output: 5

        int[] a2 = {10, 20, 30};
        int[] b2 = {40, 50, 10};
        System.out.println("Size of union: " + findUnion(a2, b2)); // Output: 5
    }
}
