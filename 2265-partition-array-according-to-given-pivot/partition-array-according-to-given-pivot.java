class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
    List<Integer> less = new ArrayList<>();
     List<Integer> equal = new ArrayList<>();
      List<Integer> greater = new ArrayList<>();
     for(int num : nums){
        if(num < pivot){
            less.add(num);
        }
         else if(num == pivot){
            equal.add(num);
         }
         else{
            greater.add(num);
         }
     }
     int ans []= new int[nums.length];
     int index  = 0;
     for(int n : less){
        ans[index++] = n;
     }
      for(int n : equal){
        ans[index++] = n;
     }
      for(int n : greater){
        ans[index++] = n;
     }
      return ans;
    }
}