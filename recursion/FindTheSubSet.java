

import java.util.* ;
import java.io.*;

/* At any stage of our Recursion, we will have 2 choices only -
a) Pick the i-th Element
b) Don't Pick the i-th Elemenent
As all our elements are Unique, our Subsets generated will be Unique as well
*/
public class Solution {
    static void helper(int i,ArrayList<Integer> arr,ArrayList<Integer> subSet,ArrayList<ArrayList<Integer>> ansSet){
        if(i==arr.size())
        {
            ansSet.add(new ArrayList<>(subSet));
            return;
        }
        //include ith element and as recursion to do its task
        subSet.add(arr.get(i));
        helper(i+1, arr, subSet, ansSet);
        //remove ith element set and ask recursion to do its task
        subSet.remove(subSet.size()-1);
        helper(i+1, arr, subSet, ansSet);
        return ;
    }
    public static ArrayList<ArrayList<Integer>> pwset(ArrayList<Integer> arr) {
        // WRITE YOUR CODE HERE
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        helper(0,arr, new ArrayList<>(),ans);
        return ans;
    }

}

/*
Time Complexity : O(2^N)
Space Complexity : O(N)
*/