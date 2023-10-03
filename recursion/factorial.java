import java.util.Scanner;

class Solution {


    static int factorial(int n){

        if(n==0)return 1;
        return n*factorial(n-1);
    }
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0){
            System.out.println(factorial(n));
        }else{
            System.out.println("Error");
        }

    }
}

/*
time complexity : 0(n)
space complexity: O (n)*/
