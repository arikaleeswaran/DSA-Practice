package Nov_22_24;
import java.util.*;

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            Map<Integer, Integer> hm = new HashMap<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                hm.put(nums[i], i);
            }
            Set<String> used = new HashSet<>();
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    int curSum = nums[i] + nums[j];
                    if (hm.containsKey(-1 * curSum)) {
                        int k = hm.get(-1 * curSum);
                        if (!used.contains(nums[i] + ":" + nums[j] + ":" + nums[k]) && k > i && k > j) {
                            ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                            used.add(nums[i] + ":" + nums[j] + ":" + nums[k]);
                        }
                    }
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            ThreeSum solution = new ThreeSum();
            int[] nums = {-1, 0, 1, 2, -1, -4};
            List<List<Integer>> result = solution.threeSum(nums);

            System.out.println("Triplets with sum zero:");
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
            }
        }
    }
