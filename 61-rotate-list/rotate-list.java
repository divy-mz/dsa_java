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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null){
            return null;
        }
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
        temp.next=head;
        ListNode brk=head;
        k=k%len;
        for(int i=1;i<=len-k-1;i++){
            brk=brk.next;
        }
        head=brk.next;
        brk.next=null;
        return head;
        
    }
}