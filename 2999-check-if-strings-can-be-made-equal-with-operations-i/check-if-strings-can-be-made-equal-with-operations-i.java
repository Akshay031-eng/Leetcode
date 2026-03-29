class Solution {
    public boolean canBeEqual(String s1, String s2) {
     
        
        char a0 = s1.charAt(0), a2 = s1.charAt(2);
        char b0 = s2.charAt(0), b2 = s2.charAt(2);
        
        char a1 = s1.charAt(1), a3 = s1.charAt(3);
        char b1 = s2.charAt(1), b3 = s2.charAt(3);
        
        boolean evencheck = (a0 == b0 && a2 == b2) || (a0 == b2 && a2 == b0);
        boolean oddcheck  = (a1 == b1 && a3 == b3) || (a1 == b3 && a3 == b1);
        
        return evencheck && oddcheck;
    }
}
    