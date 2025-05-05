class Solution {
    public void moveZeroes(int[] nums) {
        int N = nums.length;
        int nonZeroPos = 0;

        for (int i = 0; i < N; i++) {
            if (nums[i] != 0) {
                swap(nums, i, nonZeroPos);
                nonZeroPos+=1;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}