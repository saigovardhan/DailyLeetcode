class Solution {
    public int singleNumber(int[] nums) {
       int zero = 0;
       for(int i : nums) {
        zero = zero ^ i;
       }
       return zero;
    }
}