class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int zeroPosition = 0;
        int twoPosition = nums.length-1;

        while(i <= twoPosition){
            if(nums[i]==0){
                swap(i, zeroPosition, nums);
                zeroPosition+=1;
                i++;
            }else if(nums[i]==1){
                i++;
            }else{
                swap(i, twoPosition, nums);
                twoPosition-=1;
            }
        }
    }

    public void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}