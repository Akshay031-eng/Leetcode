class Solution {
    public int majorityElement(int[] nums) {
      int count =0;
      int cand =0;
       for(int n :nums){
        if(count ==0){
         cand = n;
        }
        if(cand == n){
            count++;
        }else{
            count--;
        }
       }
        return cand;
    }
}