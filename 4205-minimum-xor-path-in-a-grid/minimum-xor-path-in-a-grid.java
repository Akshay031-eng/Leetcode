class Solution {
    public int minCost(int[][] grid) {
                int p = grid.length;
        int q = grid[0].length;

        boolean[][][] dp = new boolean[p][q][1024];

        dp[0][0][grid[0][0]] = true;

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                int val = grid[i][j];

                if (i > 0) {
                    for (int x = 0; x < 1024; x++) {
                        if (dp[i - 1][j][x]) {
                            dp[i][j][x ^ val] = true;
                        }
                    }
                }

                if (j > 0) {
                    for (int x = 0; x < 1024; x++) {
                        if (dp[i][j - 1][x]) {
                            dp[i][j][x ^ val] = true;
                        }
                    }
                }
            }
        }

        for (int x = 0; x < 1024; x++) {
            if (dp[p - 1][q - 1][x]) {
                return x;
            }
        }

        return -1;
    }
    }
