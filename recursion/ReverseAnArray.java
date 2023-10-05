import java.util.* ;
import java.io.*;
import java.util.ArrayList;

public class Solution
{
    static int reverseArray(int l,int r, ArrayList<Integer> arr){
        //step-4 base condition
        if(l>=r) return 1;
        //step-2 Do small task
        Collections.swap(arr,l,r);
        //step-3 ask recursion to do remaining part
        return reverseArray(l+1, r-1, arr);
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        reverseArray(m+1, arr.size()-1, arr);
    }
}

//T.C: O(n)
//S.C: O(n)