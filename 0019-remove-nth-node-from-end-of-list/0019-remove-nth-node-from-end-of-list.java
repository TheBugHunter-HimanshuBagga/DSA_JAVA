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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // given head of linkedList
        // remove nth node from the end of the list and return it

        // get the length of the LL
        // from the length of the LL - n
        // from that -1 
        // then retun the next node from there

        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        if(n == count){ // remove the head
            return head.next;
        }
        
        // count = 5 

        int index = count - n - 1; // 5 - 2 - 1 = 2

        temp = head;
         
        // but i to remove the 2.next and return the new list
        for(int i = 0 ; i < index ; i++){
            temp = temp.next;
        }
        // temp is at 3

        temp.next = temp.next.next;

        return head;

    }
}