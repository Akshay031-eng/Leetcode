class Solution {
    public int fib(int n) {
        // memorization technique
    //     int dp[]= new int[n+1];
    //     // fill dp with -1;
    //     Arrays.fill(dp,-1);
    //     return helper(n,dp);


    // }
    // int helper(int n , int dp[]){
    //     if(n ==0 || n== 1){
    //         return n;
    //     }
    //      if(dp[n] != -1){
    //         return dp[n];
    //      }
    //      int first = helper(n-1, dp);
    //      int second = helper(n-2, dp);
    //      dp[n]= first + second;
    //      return dp[n];
    // *********************tabular method
    // if(n<=1){
    //     return n;
    // }
    // int dp[]= new int[n+1];
    // dp[0]=0;
    // dp[1]=1;
    // for(int i= 2; i<=n ;i++){
    //     dp[i]= dp[i-1]+ dp[i-2];
    // }
    // return dp[n];
    // ********************************edge casee
    if(n<=1){
        return n;
    }
    int first = 0;
    int second = 1;
     int third = 0;
     for(int i = 2; i<=n ;i++){
        third = first +second;
        first = second;
        second = third;
     }
     return third;
    }
}