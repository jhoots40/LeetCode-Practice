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
    public int getDecimalValue(ListNode head) {
        List<Integer> list = new ArrayList<>();
        int result = 0;
        
        traverse(head, list);
        
        for(int i = 0; i < list.size(); i++) result += (list.get(i) * Math.pow(2, i));
        
        return result;
    }
    
    public void traverse(ListNode current, List<Integer> list) {
        if(current == null) return;
        
        traverse(current.next, list);
        list.add(current.val);
    }

}