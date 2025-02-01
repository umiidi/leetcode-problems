public class MaximumSubarray {

    // 53. Maximum Subarray
    public int maxSubArray(int[] nums) {
        int maximum = Integer.MIN_VALUE, temp = 0;

        for (int num : nums) {
            temp = Math.max(temp + num, num);
            maximum = Math.max(maximum, temp);
        }

        return maximum;
    }

    public static void main(String[] args) {
        MaximumSubarray main = new MaximumSubarray();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        int result = main.maxSubArray(nums);

        System.out.println(result);
    }

}
