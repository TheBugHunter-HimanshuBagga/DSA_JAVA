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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        for(int i = 1 ; i < a ; i++){ 
            temp1  = temp1.next; // 13
        }
        ListNode newHead = temp1.next; // 6(newHead) -> 9 -> 5
        ListNode temp3 = newHead;
        temp1.next = list2;
        for(int j = a; j < b; j++){
            temp3 = temp3.next;
        }
        ListNode ultraNewHead = temp3.next;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = ultraNewHead;

        return list1;
    }
}