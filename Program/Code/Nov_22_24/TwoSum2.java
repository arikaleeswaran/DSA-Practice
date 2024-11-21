package Nov_22_24;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int[] ans = new int[2];
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) {
                ans[0] = l + 1; // 1-based index
                ans[1] = r + 1; // 1-based index
                break;
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TwoSum2 obj = new TwoSum2();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
