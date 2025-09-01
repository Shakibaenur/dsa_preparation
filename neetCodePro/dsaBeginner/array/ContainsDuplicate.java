/*
Leetcode 217. Contains Duplicate
Solved
        Easy
Topics
premium lock icon
        Companies
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.
Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.
Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]*/
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        //brute force
        //return bruteForceMethod(nums);
        //sorting
        //return sortingMethod(nums);
        //hash set
        //return hashSetMethod(nums);
    }

    private boolean bruteForceMethod(int[] nums){
        int n = nums.length; // n is the size of array
        for(int i =0; i< n-1; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i]== nums[j]){
                    return true;
                }
            }
        }
        return false;
        // Time complexity: O(n^2) ; Space Complexity: O(1)
    }

    private boolean sortingMethod(int[] nums){
        // example [1,2,3,1]
        int n = nums.length;
        Arrays.sort(nums); //e.g., [1,2,3,1] -> [1,1,2,3]
        for(int i = 1; i< n-1 ; i++){
            if(nums[i] == nums[i-1]){
                return true;
            }
        }
        return false;
        // Time complexity : O(nlogn)
//         Space complexity : Arrays.sort(nums) in Java uses Dual-Pivot Quicksort for primitives (like int[]).
//          That algorithm has O(log n) auxiliary space (due to recursion stack).
    }

    private boolean hashSetMethod(int[] nums){
        Set<Integer> numsSet = new HashSet<>();
        for(int num: nums){
            if(numsSet.contains(num)){
                return true;
            }
            numsSet.add(num);
        }
        return false;

        // Time Complexity: O(n) Space Complexity: O(n)
    }
}