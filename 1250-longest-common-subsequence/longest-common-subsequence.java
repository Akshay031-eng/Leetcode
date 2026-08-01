class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
    //   /*  // Apporach -2 Memorization mean add dp array
          int n = text1.length();
          int m = text2.length();
          int dp[][]= new int[n][m];
          for(int row[] : dp){
            Arrays.fill(row, -1);
          }
          return helper(0,0, text1, text2, dp);
    }
   
        //   Approach -3 tabular method
        //  int m = text1.length();
        //   int n = text2.length();
        //   int dp[][]= new int[n+1][m+1];
        //   for(int i= 0 ; i <=m ;i++){
        //     for(int j =0 ; j<=n;j++){  
        //         dp[i][0] = 0;
        //         dp[0][j] = 0;
                

        //     }
        //   }
        // ***************************Recursion method 

    //       return helper(0,0, text1,text2);
    // }
    int helper(int i , int j , String text1, String text2 , int dp[][] ){
        if(i == text1.length() || j == text2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i) == text2.charAt(j)){
            return 1 + helper(i+1, j+1 ,text1, text2,dp);
        }
       int choice1 = helper(i+1, j , text1, text2,dp);
        int choice2 = helper(i, j+1 , text1, text2,dp);
        int max  = Math.max(choice1, choice2);
        dp[i][j]  = max;
        return dp[i][j];
    }
}
    