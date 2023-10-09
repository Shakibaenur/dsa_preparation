import java.util.* ;
import java.io.*;
public class Solution {
    static void helper(int pos, int n, ArrayList<Integer> arr,ArrayList<Integer> ans){
        if(pos>=n){
            ans.add(new ArrayList<>(arr));
            return;
        }

        HashSet set= new HashSet<>();
        for(int i=pos;i<n;i++){
            if(set.contains(arr[i]))
                continue;
            Collections.swap(arr, pos, i);
            helper(pos+1, n, arr, ans);
            Collections.swap(arr, pos,i);
        }
        return;
    }
    public static ArrayList<ArrayList< Integer >> uniquePermutations(ArrayList<Integer> arr, int n) {
        // Write your code here.
        ArrayList<ArrayList< Integer >> ans= new ArrayList<>();
        helper(0, arr.size(), arr, ans);
        return ans;

    }
}

