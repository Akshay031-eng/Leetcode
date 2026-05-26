

 class Solution {
    boolean isAnagram(String First , String Second){
        if(First.length() != Second.length() )
            return false;
        
        char[]x = First.toCharArray();
          char[]y = Second.toCharArray();
          Arrays.sort(x);
          Arrays.sort(y);
          return Arrays.equals(x,y);
          //it anagram function 

        
    }
public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> biglist = new ArrayList<>();
        for(String word: strs){
            boolean added = false;
            //  flag check it is already in list 
            for(List<String> SmallList: biglist){
                if(isAnagram(SmallList.get(0), word)){
                    SmallList.add(word);
                    added = true;
                     break;

                }
            }
            if(! added){
                List<String> newList = new ArrayList<>();
                newList.add(word);
                biglist.add(newList);
            }
        }
         return biglist;
    }
}

