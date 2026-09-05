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
    public boolean isPalindrome(ListNode head) {
        // return true or false
         // Copy the original list
        ListNode original = copyList(head);

        // Reverse the original list
        ListNode reversedHead = reverse(head);

        // Compare original and reversed list
        ListNode tempA = original;
        ListNode tempB = reversedHead;


        while(tempA != null && tempB != null){
            if(tempA.val != tempB.val){
                return false;
            }
            tempA = tempA.next;
            tempB = tempB.next;
        }   
        return true;
    }
    static ListNode copyList(ListNode head){
        if(head == null){
            return null;
        }
        ListNode newHead = new ListNode(-1);
        ListNode temp2 = newHead;
        ListNode temp1 = head;
        while(temp1 != null){
            temp2.next = new ListNode(temp1.val);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return newHead.next;
    }
    static ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}