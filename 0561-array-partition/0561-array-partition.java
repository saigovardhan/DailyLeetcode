class Solution {
    public int arrayPairSum(int[] nums) {
        int totalSum=0;
        Arrays.sort(nums);
        int i=0;
        while(i!=nums.length){
            totalSum += nums[i];
            i+=2;
        }
        return totalSum;
    }
}