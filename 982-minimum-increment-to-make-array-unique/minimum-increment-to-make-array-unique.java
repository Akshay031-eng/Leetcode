class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int  minInc = 0;
        for(int  i = 1; i<nums.length;i++){
            if(nums[i] <= nums[i-1]){
                int inc  = nums[i-1] +1 -nums[i];
                minInc  += inc;
                nums[i] = nums[i-1]+1;
            }
        }
         return minInc;
    }
}