
//most effecient way

/*The isPowerOfTwo method takes an integer n as input and returns a boolean value indicating
whether n is a power of two.

It starts by checking if n is less than or equal to 0. If n is non-positive (0 or negative),
it immediately returns false because powers of two are positive integers, and 0 is not considered a power of two.

If n is greater than 0, the code proceeds to the next step, which checks if n is a power of two.

The key to this check is the bitwise operation (n & (n - 1)). Here's how it works:
n - 1 is equivalent to flipping all the bits of n from the rightmost set bit to the end.
For example, if n is 8 (binary 1000), then n - 1 is 7 (binary 0111).
When you perform a bitwise AND operation between n and n - 1, the
result will be zero if and only if n has exactly one bit set to 1.
In other words, if n is a power of two, it will have a binary
representation with only one bit set to 1. All other bits will be 0.

For example, 8 & 7 is 0, which means 8 is a power of two. Similarly,
4 & 3 is 0, indicating that 4 is also a power of two. However, for numbers like 6
(binary 0110), 6 & 5 is not 0, so 6 is not a power of two.
The result of the bitwise AND operation (n & (n - 1)) is checked for
equality with 0. If the result is 0, it means there is only one set bit in the
binary representation of n, which confirms that n is a power of two, and the function
returns true. Otherwise, it returns false.*/


class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Using bitwise AND to check if there is only
        // one set bit (power of 2).
        return (n & (n - 1)) == 0;
    }
}

// Time Complexity: O(1)
// Space Complexity: O(1)

//normal brute force way

class Solution {

    public boolean isPowerOfTwo(int n) {
        int i = 1;
        while (i < n) {
            i = i * 2;
        }
        return i == n;
    }
}
// Time Complexity: O(log n)
// Space Complexity: O(1) but it takes time limit exit

//recursive way to solve

class Solution {

    public boolean isPowerOfTwo(int n) {
        // Base case: If n is 1, it's a power of 2.
        if (n == 1) {
            return true;
        }
        // Base case: If n becomes odd or less than 1, it's not a power of 2.
        if (n % 2 != 0 || n <= 0) {
            return false;
        }
        // Recursive case: Keep dividing n by 2.
        return isPowerOfTwo(n / 2);
    }
}
//T.C: O(logn)
//S.C: O(logn)