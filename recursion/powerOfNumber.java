
class Solution {
    public static long Pow(int X, int N) {
        if(N==0) return 1;
        return X* Pow(X,N-1);
    }
}

/*
T.C: O(n)
S.C: O(n)*/
