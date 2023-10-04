
class Solution {
    public static long Pow(int X, int N) {
        if(N==0) return 1;
        return X* Pow(X,N-1);
    }
    /*
T.C: O(n)
S.C: O(n)*/

}

/*Better Solution*/

class Solution {
    public static long Pow(int X, int N) {
        if(N==0) return 1;//base condition
        long temp=Pow(X,N/2);
        if(N%2==1) {
            return temp*temp*X;
        }
        return temp*temp;
    }
    /*
    n\2^k
    =>logn=log2^k
    =>k=logn/log2
    =>k=log2n
T.C: O(log2n)
S.C: O(log2n)*/

}
