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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        Stack<Integer> st = new Stack<>();
        
        while(head !=  null){
            st.push(head.val);
            head = head.next;
        }
        ListNode revNode = new ListNode(st.pop(),null);
        head = revNode;
        while(!st.isEmpty()){
            head.next = new ListNode(st.pop());
            head = head.next;
        }
        head.next = null;

        return revNode;
    }
}