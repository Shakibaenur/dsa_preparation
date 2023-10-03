import java.util.Scanner;

public class Solution {

    static int fibo(int n){
        if(n==1) return 1;
        if(n==2) return 1;
        int partialAns1=fibo(n-1);
        int partialAns2=fibo(n-2);
        return partialAns1+partialAns2;
    }

    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibo(n));

    }

}

/*
Very bad
Time Complexity: O(2^n)=node count = (r^n-1)/n-1
Space Complexity: O(n)= Recursive tre height*/
