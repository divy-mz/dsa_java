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
    public ListNode mergeNodes(ListNode head) {
        ListNode r=head;
        ListNode w=head;
        while(r!=null){
            int sum=0;
            while(r.val!=0){
                sum=sum+r.val;
                r=r.next;
            }
            w.val=sum;
            w.next=r.next;
            r=r.next;
            w=w.next;

        }
        return head.next;
    }
}