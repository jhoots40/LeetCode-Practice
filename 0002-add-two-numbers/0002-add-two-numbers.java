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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode result = new ListNode();
        ListNode current = result;
        boolean firstNode = true;
        while(l1 != null && l2 != null) {
            current.next = new ListNode();
            current = current.next;
            int add = l1.val + l2.val + carry;
            carry = add / 10;
            int value = add % 10;
            current.val = value;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        if(l1 != null) {
            while(l1 != null)
            {
                current.next = new ListNode();
                current = current.next;
                int add = l1.val + carry;
                carry = add / 10;
                int value = add % 10;
                current.val = value;
                l1 = l1.next;
            }
        }

        if(l2 != null) {
            while(l2 != null)
            {
                current.next = new ListNode();
                current = current.next;
                int add = l2.val + carry;
                carry = add / 10;
                int value = add % 10;
                current.val = value;
                l2 = l2.next;
            }
        }

        if(carry != 0) {
            current.next = new ListNode(carry);
        }

        result = result.next;
        return result;
    }
}