
//Leetcode : 206 Given the head of a singly linked list, reverse the list, and return the reversed list.

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
    public ListNode reverseList(ListNode head) {
        //IterativeWay
        // return iterativeWay(head);
        return recursiveWay(head);
    }

    private ListNode iterativeWay(ListNode head){
        ListNode previousNode = null;
        ListNode currentNode = head;
        while(currentNode != null){
            ListNode tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode =  currentNode;
            currentNode = tempNode;
        }
        return previousNode;

//         Complexity:
//         Time: O(n) (visit each node once)
//         Space: O(1) (constant extra variables)
    }

    private ListNode recursiveWay(ListNode head){
        if(head == null || head.next== null) return head; // base condition stop if has one node or empty
        ListNode newHead = head;
        if(newHead.next != null){
            newHead = recursiveWay(head.next);
            ListNode temp = head.next;
            temp.next = head;
            head.next = null;
        }
        return newHead;
// Space complexity is not O(1) → recursion uses the call stack. For n nodes, recursion depth = n.
// Time: O(n) ✅
// Space: O(n).
    }
}