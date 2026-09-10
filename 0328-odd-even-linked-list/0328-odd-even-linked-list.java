class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode Odd = new ListNode(-1);
        ListNode tempOdd = Odd;

        ListNode Even = new ListNode(-1);
        ListNode tempEven = Even;

        ListNode temp = head;

        while (temp != null) {

            // Save next node
            ListNode next = temp.next;

            // Add odd node
            tempOdd.next = temp;
            tempOdd = tempOdd.next;

            // Break old connection
            tempOdd.next = null;

            // Move to even node
            temp = next;

            if (temp != null) {

                // Save next node
                next = temp.next;

                // Add even node
                tempEven.next = temp;
                tempEven = tempEven.next;

                // Break old connection
                tempEven.next = null;

                // Move to next odd node
                temp = next;
            }
        }

        // Connect odd list to even list
        tempOdd.next = Even.next;

        return Odd.next;
    }
}