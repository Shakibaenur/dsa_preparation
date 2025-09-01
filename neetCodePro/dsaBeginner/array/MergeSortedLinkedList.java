/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        return iterativeWay(list1,list2);
    }
    private ListNode iterativeWay(ListNode list1, ListNode list2){
        ListNode mergedList = new ListNode(0);
        ListNode mergedNode = mergedList;
        while(list1 != null && list2 !=null){
            if(list1.val < list2.val){
                mergedNode.next = list1;
                list1 = list1.next;
            } else {
                mergedNode.next = list2;
                list2 = list2.next;
            }
            mergedNode = mergedNode.next;
        }
        if(list1!=null){
            mergedNode.next = list1;
        } else {
             mergedNode.next = list2;
        }
        return mergedList.next;
//        Time Complexity
//        You traverse each node of list1 and list2 exactly once.
//
//        Let n = length(list1), m = length(list2).
//
//        Total operations = n + m.
//
//        Time = O(n + m) ✅
//
//        🗂 Space Complexity
//
//        You only use a few pointers (mergedList, mergedNode, etc.).
//
//        No extra data structures.
//
//        Space = O(1) ✅
    }


    private ListNode recursiveWay(ListNode list1, ListNode list2){
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val<=list2.val){
            list1.next = recursiveWay(list1.next, list2);
            return list1;
        } else {
            list2.next = recursiveWay(list1, list2.next);
            return list2;
        }
        //         ✅ Final Answer:
//      Time Complexity: O(n + m)
//      Space Complexity: O(n + m) space (stack)
    }
}