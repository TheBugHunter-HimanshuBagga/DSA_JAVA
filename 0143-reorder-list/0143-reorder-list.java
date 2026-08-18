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
    public void reorderList(ListNode head) {
        // reorder list
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = slow.next;
        slow.next = null;
        
        ListNode curr = newHead;
        ListNode next = null;
        ListNode prev = null;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode temp1 = head;
        while(temp1 != null && prev != null){   
            ListNode next2 = temp1.next;
            ListNode prev2 = prev.next;
            temp1.next = prev;
            prev.next = next2;

            temp1 = next2;
            prev = prev2;
        }
    }
}
/*
1 - 2 - 3
4(newHead) - 5

1 - 2 - 3
5 - 4
*/