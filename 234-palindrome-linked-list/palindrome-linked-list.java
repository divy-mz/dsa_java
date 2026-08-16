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
    public ListNode rev(ListNode list2){
        ListNode prev=null;
        ListNode curr=list2;
        while(curr!=null){
            ListNode forward=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
        }
        return prev;


        }
        public ListNode mid(ListNode head){
            ListNode slow=head;
            ListNode fast=head;
            while(fast.next!=null && fast.next.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;

        }
    public boolean isPalindrome(ListNode head) {
        ListNode list2=mid(head);
        ListNode head2=rev(list2);
        ListNode temp=head;
        while(temp!=list2){
            temp=temp.next;
        }
        temp.next=null;
        while(head!=null && head2!=null){
            if(head.val!=head2.val){
                return false;
            }
            else{
                head=head.next;
                head2=head2.next;
            }
        }
        return true;
 
}
}