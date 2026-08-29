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
    public ListNode partition(ListNode head, int x) {
        ListNode h1=new ListNode(-1);
        ListNode t1=h1;
        ListNode h2=new ListNode(-1);
        ListNode t2=h2;
        ListNode curr=head;
        while(curr!=null){
            if(curr.val<x){
                ListNode less=new ListNode(curr.val);
                t1.next=less;
                t1=less;
                curr=curr.next;
            }
            else{
                ListNode high=new ListNode(curr.val);
                t2.next=high;
                t2=high;
                curr=curr.next;
            }
        }
        t1.next=h2.next;
        h1=h1.next;
        return h1;

        
    }
}