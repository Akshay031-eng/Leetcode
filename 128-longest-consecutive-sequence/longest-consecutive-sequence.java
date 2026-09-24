class Solution {
    public int longestConsecutive(int[] nums) {
        int longest= 0;
        Map<Integer,Boolean> Emap = new HashMap<>();
        for(int num :nums){
            Emap.put(num, Boolean.FALSE);
        }
        for(int num :nums){
            int currentLength =1;
            int nextNum =num+1;
            while(Emap.containsKey(nextNum) && Emap.get(nextNum) == false){
            currentLength++;
            Emap.put(nextNum,Boolean.TRUE) ;
            nextNum++;
            }
        int preNum = num-1;
        while(Emap.containsKey(preNum) && !Emap.get(preNum)){
        currentLength++;
        Emap.put(preNum,Boolean.TRUE);
        preNum--;
        }
        longest =Math.max(longest, currentLength);
        }
        return longest;
    }
}