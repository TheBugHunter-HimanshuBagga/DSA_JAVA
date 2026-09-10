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
    public ListNode rotateRight(ListNode head, int k) {
        int count = 0;
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        k = k % count;

        if(k == 0){
            return head;
        }

        temp = head;

        for(int i = 1; i < count - k ; i++){
            temp = temp.next;
        }
        ListNode newHead = temp.next;
        temp.next = null;

        // 4(hewHead) -> 5


        ListNode temp2 = newHead;
        while(temp2.next != null){
            temp2 = temp2.next;
        }

        temp2.next = head;
        head = newHead;


        return head;
    }
}