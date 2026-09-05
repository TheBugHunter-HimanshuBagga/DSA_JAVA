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
    public ListNode swapNodes(ListNode head, int k) {

        int count = 0;
        ListNode temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        temp = head;
        for(int i = 1 ; i <  k ; i++){
            temp = temp.next;
        }
        ListNode left = temp;

        temp = head;
        for(int i = 1 ; i < count - k + 1; i++){
            temp = temp.next;
        }
        ListNode right = temp;

        // now i have this left and right with me hence just sort this shit

        int tempVal = left.val;
        left.val = right.val;
        right.val = tempVal;

        return head;
    }
}