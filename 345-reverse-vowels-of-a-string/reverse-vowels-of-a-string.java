class Solution {

    boolean isVowels(char ch) {
        return "AEIOUaeiou".indexOf(ch) >= 0;
    }

    public String reverseVowels(String s) {

        char str[] = s.toCharArray(); // Correct method name

        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {

            if (!isVowels(str[left])) {
                left++;
            }

            else if (!isVowels(str[right])) { // Correct method name
                right--;
            }

            else {
                // swap vowels
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;

                left++;
                right--;
            }
        }

        return new String(str); // Convert char array back to String
    }
}