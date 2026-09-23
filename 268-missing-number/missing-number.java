class Solution {
    public int missingNumber(int[] nums) {
        int dig = nums.length;
        for(int i=0;i<nums.length;i++){
            dig  ^= i^nums[i];
            
        }
         return dig;
    }
}