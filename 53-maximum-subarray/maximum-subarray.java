class Solution {
    public int maxSubArray(int[] nums) {
        // int sum = 0;
        // int max = Integer.MIN_VALUE;
        // for(int i = 0 ; i< nums.length;i++){
        //     sum = sum + nums[i];
        //     if(sum > max){
        //         max = sum;
        //     }
        //     if(sum < 0){
        //         sum =0;
        //     }
        // }
        // return max
        int maxSum = nums[0];
         int sum =0;
         for(int i  =0; i<nums.length; i++){
            sum = sum +nums[i];
            sum = Math.max(sum , nums[i]);
            maxSum = Math.max(maxSum, sum);
         }
          return maxSum;
    }
}