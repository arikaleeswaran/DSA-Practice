public class TransitionPoint {
    // Function to find the transition point in the array
    int transitionPoint(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        TransitionPoint solution = new TransitionPoint();

        int[] arr = {0, 0, 0, 1, 1, 1};
        int result = solution.transitionPoint(arr);

        if (result != -1) {
            System.out.println("The transition point is at index: " + result);
        } else {
            System.out.println("No transition point found.");
        }
    }
}
