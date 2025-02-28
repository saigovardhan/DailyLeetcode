class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start = 0, end = 0, minWindow = Integer.MAX_VALUE, temp = 0;

        while(end < nums.length){
            temp+=nums[end];

            while(start < nums.length && temp >=target){
                minWindow = Math.min(minWindow, end-start+1);
                temp-=nums[start];
                start+=1;
            }

            end+=1;
        }

        return minWindow == Integer.MAX_VALUE? 0 : minWindow;
    }
}