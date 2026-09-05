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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        if(left > 1){
            for(int i = 1; i < left - 1; i++){ // left = 2 , 1 < 2 ,  1 < 1
                temp = temp.next;
            }
        }
        ListNode newHead;
        if(left == 1){
            newHead = temp;
        }else{
            newHead = temp.next;
            temp.next = null;
        }

        ListNode temp2 = newHead;

        for(int j = left ; j < right ; j++){
            temp2 = temp2.next;
        }
        ListNode newHead2 = temp2.next;

        temp2.next = null;

        ListNode curr = newHead;
        ListNode prev = null;
        ListNode next1 = null;
        while(curr != null){
            next1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next1;
        }

        if(left == 1){
            head = prev;
        }else{
            temp.next = prev;
        }

        newHead.next = newHead2;

        return head;
    }
}