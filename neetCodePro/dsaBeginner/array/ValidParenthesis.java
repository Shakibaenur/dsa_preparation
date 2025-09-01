//
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//        Example 1:
//
//        Input: s = "()"
//
//        Output: true
//
//        Example 2:
//
//        Input: s = "()[]{}"
//
//        Output: true
//
//        Example 3:
//
//        Input: s = "(]"
//
//        Output: false
//
//        Example 4:
//
//        Input: s = "([])"
//
//        Output: true
//
//        Example 5:
//
//        Input: s = "([)]"
//
//        Output: false
//
//
//
//        Constraints:
//
//        1 <= s.length <= 104
//        s consists of parentheses only '()[]{}'.

class Solution {
    public boolean isValid(String s) {
        Stack<Character> resultStack = new Stack<>();
        Map<Character, Character> closeToOpenMap = new HashMap<>();
        closeToOpenMap.put(')','(');
        closeToOpenMap.put('}','{');
        closeToOpenMap.put(']','[');
        for(char c: s.toCharArray()){
            if(closeToOpenMap.containsKey(c)){
                if(!resultStack.isEmpty() && resultStack.peek() == closeToOpenMap.get(c)){
                    resultStack.pop();
                } else{
                    return false;
                }
            } else {
                resultStack.push(c);
            }
        }
        return resultStack.isEmpty();
    }

    // Time Complexity O(n) and Space Compexity O(n)
}