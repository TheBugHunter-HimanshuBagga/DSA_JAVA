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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;

        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }

        temp = head;
        int[] result = new int[count] ;
        int index = 0;

        while(temp != null){
            ListNode check = temp.next;

            while(check != null){
                if(check.val > temp.val){
                    result[index] = check.val;
                    break;
                }
                check = check.next;
            }
            temp = temp.next;
            index++;
        }
        return result;
    }
}