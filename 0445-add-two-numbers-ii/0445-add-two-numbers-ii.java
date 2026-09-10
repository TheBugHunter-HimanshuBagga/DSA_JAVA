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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // reverse the LL l1
        ListNode curr1 = l1;
        ListNode next1 = null;
        ListNode prev1 = null;
        while(curr1 != null){
            next1 = curr1.next; 
            curr1.next = prev1;
            prev1 = curr1;
            curr1 = next1;
        }
        // prev1 -> 3 - 4 - 3 - 7

        // reverse the LL l2
        ListNode curr2 = l2;
        ListNode next2 = null;
        ListNode prev2 = null;
        while(curr2 != null){
            next2 = curr2.next; 
            curr2.next = prev2;
            prev2 = curr2;
            curr2 = next2;
        }
        // prev2 -> 4 - 6 - 5

        // get the sum of reversed LL
        ListNode newHead = new ListNode(-1);
        ListNode temp1  = newHead;

        int remaining = 0;
        int sum = 0;
        int carry = 0;
        // prev1 = head of l1. prev2 head of l2
        while(prev1 != null && prev2 != null){
            sum = prev1.val + prev2.val + carry;

            remaining = sum % 10; 
            carry = sum / 10;
            
            temp1.next = new ListNode(remaining);
            temp1 = temp1.next;
            prev1 = prev1.next;
            prev2 = prev2.next;
        }
        while(prev1 != null){
            sum = prev1.val + carry;
            remaining = sum % 10; 
            carry = sum / 10;
            temp1.next = new ListNode(remaining);
            temp1 = temp1.next;
            prev1 = prev1.next;
        }

        while(prev2 != null){
            sum = prev2.val + carry;
            remaining = sum % 10; 
            carry = sum / 10;
            temp1.next = new ListNode(remaining);
            temp1 = temp1.next;
            prev2 = prev2.next;
        }

        if(carry > 0){
            temp1.next = new ListNode(carry);
        }


        // reverse the sum and return
        temp1 = newHead.next;
        ListNode prev3 = null;
        ListNode next3 = null;
        while(temp1 != null){
            next3 = temp1.next;
            temp1.next = prev3;
            prev3 = temp1;
            temp1 = next3;
        } 
        return prev3;
    }
}