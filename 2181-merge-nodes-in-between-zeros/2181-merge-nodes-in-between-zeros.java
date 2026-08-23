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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp1 = head;

        ListNode newHead = new ListNode(-1);
        ListNode temp2 = newHead;

        while(temp1.next != null){
            int sum = 0;
            ListNode check = temp1.next;
            while(check != null){
                if(check.val != 0){
                    sum = sum + check.val;
                    check = check.next;
                }
                else{
                    break;
                }
            }
            temp2.next = new ListNode(sum);
            temp2 = temp2.next;
            temp1 = check;
        }
        return newHead.next;
    }
}