class Solution {
    public int removeDuplicates(int[] nums) {
       int writer = 0;
       for(int i  =0;i<nums.length;i++){
        if(nums[writer] != nums[i])
          
          nums[++writer] = nums[i];
       }
       return writer+1;
    }
}