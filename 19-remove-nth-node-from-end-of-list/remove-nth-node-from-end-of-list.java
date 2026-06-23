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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode f=head, s=head;
        if(head.next==null) return null;
        while(n-->1){
            f=f.next;
            if(f.next==null){
                return head.next;
            }
        }
        while(f.next.next!=null){
            f=f.next;
            s=s.next;
        }
        s.next=s.next.next;
        return head;
    }
}