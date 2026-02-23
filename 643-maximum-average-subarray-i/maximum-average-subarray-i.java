class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // approach sliding window
        // step 1 do  the sum 
         int sum  =0;
        for(int i =0 ; i<k;i++){
            sum = sum + nums[i];
        }
        int maxSum = sum;
        for(int right  = k; right<nums.length; right++){
            int left  =  right -k;
            sum  = sum-nums[left]+nums[right];
            maxSum = Math.max(maxSum , sum);
        }
        return (double) maxSum / k;
        
    }
}