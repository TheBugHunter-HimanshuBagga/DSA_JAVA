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
    public int pairSum(ListNode head) {
        // 5 -> 4 -> 2 -> 1
        // GOAL is to break in half
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        // 1 - 2 - 3 and 4 - 5 - 6
        // but i need 4 - 5 - 6 to 6 - 5 - 4

        ListNode curr = newHead;
        ListNode next1 = null;
        ListNode prev = null;
        while(curr != null){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }

        // 1 - 2 - 3 
        // 6 - 5 - 4

        ListNode temp1 = head;
        ListNode temp2 = prev;
        int maxSum = 0;
        while(temp1 != null && temp2 != null){
            int sum = 0;
            sum += temp1.val + temp2.val;
            maxSum = Math.max(sum, maxSum);

            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return maxSum;

    }
}