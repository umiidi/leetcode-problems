public class MissingNumber {

    // 268. Missing Number
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int sum = n * (n + 1) / 2;

        for (int num : nums) {
            sum -= num;
        }

        return sum;
    }

    public static void main(String[] args) {
        MissingNumber main = new MissingNumber();

        int[] nums = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        int result = main.missingNumber(nums);

        System.out.println(result);
    }

}
