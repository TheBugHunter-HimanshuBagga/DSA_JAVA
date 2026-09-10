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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp1 = head;

        ListNode newHead = new ListNode(-1);
        ListNode temp2 = newHead;

        HashSet<Integer> set = new HashSet<>();
 
        for(int i = 0 ; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]); // set now becomes {1,2,3}
            }
        }

        while(temp1 != null){
            if(!set.contains(temp1.val)){
                temp2.next = temp1;
                temp2 = temp2.next;
                temp1 = temp1.next;
            }else{
                temp1 = temp1.next;
            }
        }
        temp2.next = null;
        return newHead.next;
    }
}