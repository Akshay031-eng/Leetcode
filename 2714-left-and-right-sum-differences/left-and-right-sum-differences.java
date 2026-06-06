class Solution {
    public int[] leftRightDifference(int[] nums) {
        int  total =0;
        int ans[] = new int [nums.length];
        for(int num : nums){
            total += num;
        }
         int leftSum =0;
        for(int i =0 ; i<nums.length;i++){
            int rightSum = total -leftSum-nums[i];
            ans[i] = Math.abs(leftSum-rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}