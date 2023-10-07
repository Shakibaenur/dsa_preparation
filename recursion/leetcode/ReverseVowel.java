class Solution {

    private boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    private void swap(int l, int r, char[] s) {
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        //Base condition 1: left should not increase than right
        while (left < right) {
            //if left is not vowel then left++
            if (!isVowel(chars[left])) {
                left++;
            } else if (!isVowel(chars[right])) {
                //if right is not vowel then right --
                right--;
            } else {
                // Swap the vowels at the left and right pointers
                swap(left,right,chars);
                left++;
                right--;
            }
        }

        return new String(chars);
    }
}

//T.C: O(n)
//S.C:O(n)