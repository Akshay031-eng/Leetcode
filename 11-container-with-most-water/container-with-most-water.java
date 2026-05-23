class Solution {
    public int maxArea(int[] height) {
        // area
        // width
        // min height
        // 2 index i, j width = j-i
        // minheight ,min(height(i), height(j))
        // area = minheight *width;
        //  int max = 0;
        // for(int i = 0 ; i<height.length;i++){
        //     for(int j =i+1;j<height.length;j++){
        //         int h =  Math.min(height[i], height[j]);
        //         int  w = j-i;
        //         int area = h*w;
        //         max = Math.max(max, area);
        //     }
        // }
        // return max ;
        // Approach -2
        int max  = 0;
         int left =0;
          int right = height.length-1;
          while(left< right) {
            int h  =  Math.min(height[left], height[right]);
            int w= right -left;
            int area = h*w;
            max = Math.max(area, max);
            if(height[left] < height[right]){
                left++;
            }
             else{
                right--;
             }
          }
           return max;
    }
}