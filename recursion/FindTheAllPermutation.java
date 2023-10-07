import java.util.ArrayList;
import java.util.Collections;


public class Solution {
    static void permutationHelper(int pos, String str,ArrayList<String> answer){
        if(pos==str.length()){
            answer.add(str);
        }else{
            for(int i=pos;i<str.length();i++){
                str=swap(str,pos,i);
                permutationHelper(pos+1, str, answer);
                str=swap(str,pos,i);
            }
        }
    }
    static String swap(String s, int pos,int nextPos){
        char temp;
        char[] strArray=s.toCharArray();
        temp=strArray[pos];
        strArray[pos]=strArray[nextPos];
        strArray[nextPos]=temp;
        return String.valueOf(strArray);

    }
    public static ArrayList<String> generatePermutations(String str) {
        // Write your code here
        ArrayList<String> answer=new ArrayList<>();
        permutationHelper(0, str, answer);
        Collections.sort(answer);
        return answer;
    }
}

/*
    time complexity : O(n * n!)
    space complexity : O(n)
*/