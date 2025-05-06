class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length ==0) return -1;
       int mostRepeated = nums[0];
       int count = 1;
       for(int n : nums){
        if(n == mostRepeated){
            count+=1;
        }else{
            count-=1;
            if(count ==0){
                mostRepeated = n;
                count+=1;
            }
        }
       }
       return mostRepeated;
    }
}