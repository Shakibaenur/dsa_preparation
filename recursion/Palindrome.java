//We can also do this using 2 pointer approach
//Recursive way
//
public class Solution {
    static Boolean palindrome(int l, int r, String s) {
        if (l >= r) return true;
        if (s.charAt(l) != s.charAt(r))
            return false;
        return palindrome(l + 1, r - 1, s);

    }

    public static Boolean isPalindrome(String s) {
        return palindrome(0, s.length() - 1, s);
    }

}
/*T.C: n/2
S.C: n/2*/

