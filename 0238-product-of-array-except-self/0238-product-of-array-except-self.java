class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        if(N==0) return nums;

        int[] result = new int[N];
        result[0] = 1;
        for(int i=1;i<N;i++){
            result[i] = nums[i-1] * result[i-1];
        }

        int product = 1;

        for(int i= N-1;i>=0;i--){
            result[i] = product * result[i];
            product *= nums[i];
        }
        return result;
    }
}