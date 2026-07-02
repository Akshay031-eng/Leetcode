class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols =  grid[0].length;
        // it move to for directions ok
    //  we need traversal of ridand each grid move in 4 directions 
    boolean [][] visited = new boolean[rows][cols];
    int count = 0;
    for(int i =0 ; i<rows;i++){
        for(int j =0 ; j< cols; j++){
            // check this land is not  already visited
            // it is land or water
            if(!visited[i][j] && grid[i][j] == '1'){
                // make dfs 
                dfsHelper(grid, visited, i ,j);
                count++;

            }

        }
    }
        return count;
    }
     void dfsHelper(char[][] grid,boolean[][] visited, int rows, int cols){
        if(rows<0 || rows>= grid.length || cols<0 || cols>= grid[0].length || visited[rows][cols] || grid[rows][cols] == '0'){
            return;
        }
        visited[rows][cols] = true;
        dfsHelper(grid, visited, rows+1, cols);//down
        dfsHelper(grid, visited, rows-1, cols);
        dfsHelper(grid, visited, rows, cols+1);
        dfsHelper(grid, visited, rows, cols-1);
     }
}