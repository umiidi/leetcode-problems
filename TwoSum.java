import java.util.HashMap;

public class TwoSum {

    // 1. Two Sum
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> position = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (position.containsKey(target - nums[i])) {
                return new int[]{i, position.get(target - nums[i])};
            } else {
                position.put(nums[i], i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum main = new TwoSum();

        int[] result = main.twoSum(new int[]{2, 7, 11, 15}, 9);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }

}
