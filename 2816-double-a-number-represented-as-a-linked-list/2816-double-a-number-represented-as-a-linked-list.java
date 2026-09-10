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
// class Solution {
//     public ListNode doubleIt(ListNode head) {
//         ListNode temp1 = head;
        
//         ListNode newHead = new ListNode(-1);
//         ListNode temp2 = newHead;
//         int mul = 0;
//         while(temp1 != null){ // 189 
//             if(temp1.next != null){
//                 mul = (mul + temp1.val) * 10;// 0 + 1 * 10 = 10. 10 + 8 * 10 = 180
//                 temp1 = temp1.next;
//             }
//             else{ // temp1next == null
//                 mul = mul + temp1.val; // 180 + 9 = 189
//             }
//         }
//         mul = mul * 2; // 378
//         int remaining = mul;
//         while(remaining > 0){
//             int remainder = remaining % 10; // 378 -> 8, 
//             temp2.next = new ListNode(remainder); // 8 -> 
//             temp2 = temp2.next;
//             remaining = remaining / 10;
//         }
//         ListNode temp3 = newHead.next;
//         ListNode next1 = null;
//         ListNode prev = null;
//         while(temp3 != null){
//             next1 = temp3.next;
//             temp3.next = prev;
//             prev = temp3;
//             temp3 = next1;
//         }
        
//         return prev;
//     }
// }

class Solution {
    public ListNode doubleIt(ListNode head) {
        ListNode temp1 = head;
        ListNode next1 = null;
        ListNode prev = null;

        ListNode newHead = new ListNode(-1);
        ListNode temp2 = newHead;
        
        while(temp1 != null){
            next1 = temp1.next;
            temp1.next = prev;
            prev = temp1;
            temp1 = next1;
        }
        // now prev is my new head
        int sum = 0;
        int remainder = 0;
        int carry = 0;

        while(prev != null){
            sum = prev.val * 2 + carry;
            remainder = sum % 10; 
            carry = sum / 10;
            temp2.next = new ListNode(remainder);
            temp2  = temp2.next;
            prev = prev.next;
        }
        if(carry > 0){
            temp2.next = new ListNode(carry);
        }
        temp2 = newHead.next;
        ListNode next2 = null;
        ListNode prev2 = null;
        while(temp2 != null){
            next2 = temp2.next;
            temp2.next = prev2;
            prev2 = temp2;
            temp2 = next2;
        }
        return prev2;
    }
}