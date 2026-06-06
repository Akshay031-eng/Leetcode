class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for(int i = 0 ; i< n; i++){
            // Primary diagonal 
             sum = sum + mat[i][i];
            //  Secondary Diagonal 
             sum = sum  + mat[i][n-i-1];
        }
             if(n%2 !=0){
                sum = sum - mat[n/2][n/2];
             
        }
        return sum ;
    }
}