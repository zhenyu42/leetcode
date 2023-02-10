import java.util.Arrays;
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int first = nums[i];
            int second = target - first;
            Integer j = map.get(second);
            if (j == null) {
                map.put(first, i);
            } else {
                return new int[]{j, i};
            }
        }
        throw new IllegalArgumentException();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] result = new Solution().twoSum(nums, 6);
        System.out.println(Arrays.toString(result));
    }
}
