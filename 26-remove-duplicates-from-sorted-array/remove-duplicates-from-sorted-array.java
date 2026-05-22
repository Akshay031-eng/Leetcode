class Solution {
    public int removeDuplicates(int[] nums) {
        //  2 pointers 
        int writer =0;
        for(int reader = 1 ; reader<nums.length;reader++){
            if(nums[writer] != nums[reader]){
                writer++;
                nums[writer] = nums[reader];
                
            }
        }
        return writer+1;
    }
}