class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
          List<List<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i<numCourses; i++){
            adjList.add(new ArrayList<>());
        }
        int []inDegree = new int[numCourses];
        for(int []pre : prerequisites){
            int a = pre[0];
            int b = pre[1];
            adjList.get(b).add(a); // connection / edge 
            inDegree[a]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i<numCourses; i++){
            if(inDegree[i] ==0){
                queue.add(i);
            }
        }
         int[] order = new int[numCourses];
        int index = 0;
        int coursesComplete = 0 ;
        while(!queue.isEmpty()){
            int course = queue.poll();
             order[index++] = course;
            coursesComplete++;
            for(int nextCourse : adjList.get(course)){
                inDegree[nextCourse]--;
                if(inDegree[nextCourse] ==0){
                    queue.add(nextCourse);
                }
            }
        }
         if (coursesComplete == numCourses) {
            return order;
        }

        return new int[0];

    }
}



        
    