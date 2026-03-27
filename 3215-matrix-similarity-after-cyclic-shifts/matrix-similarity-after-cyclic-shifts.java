class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;
        
        k = k % m; // important optimization
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                
                int newCol;
                
                if (i % 2 == 0) {
                    // left shift
                    newCol = (j + k) % m;
                } else {
                    // right shift
                    newCol = (j - k + m) % m;
                }
                
                if (mat[i][j] != mat[i][newCol]) {
                    return false;
                }
            }
        }
        
        return true;
    }
}
   