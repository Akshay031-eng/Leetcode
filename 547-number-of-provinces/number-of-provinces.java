class Solution {
    public int findCircleNum(int[][] isConnected) {
         int V = isConnected.length;// number of vertex
         boolean [] visited= new boolean[V];
         int countProvinces = 0;
        //  explore all vertex
         for(int i =0 ; i<V ;i++){
            if(!visited[i]){
                dfsHelper(i, isConnected, visited);
                countProvinces++;
            }

         }
         return countProvinces;

        
    }
    void dfsHelper(int vertex, int[][] isConnected, boolean [] visited ){
       visited[vertex] = true;
       for(int neighbour = 0;neighbour<isConnected.length;neighbour++){
        if(! visited[neighbour] && isConnected[vertex][neighbour] == 1){
               dfsHelper(neighbour, isConnected, visited);
        }
       }
    }
}