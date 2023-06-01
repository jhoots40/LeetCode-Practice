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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //placeholder head of list
        ListNode result = new ListNode();
        ListNode current = result;
        
        while(list1 != null && list2 != null) {
            current.next = new ListNode();
            current = current.next;
            if(list1.val <= list2.val) {
                current.val = list1.val;
                list1 = list1.next;
            }
            else {
                current.val = list2.val;
                list2 = list2.next;
            }
        }
        
        while(list1 != null) {
            current.next = new ListNode();
            current = current.next;
            current.val = list1.val;
            list1 = list1.next;
        }
        
        while(list2 != null) {
            current.next = new ListNode();
            current = current.next;
            current.val = list2.val;
            list2 = list2.next;
        }
        
        return result.next;
    }
}