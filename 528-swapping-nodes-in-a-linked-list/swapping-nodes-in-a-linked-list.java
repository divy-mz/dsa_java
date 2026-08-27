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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first=head;
        ListNode sec=head;
        int len=1;
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            len++;
        }
    
        for(int i=1;i<=k-1;i++){
            first=first.next;
        }
        int m=len-k;
        for(int i=1;i<=m;i++){
            sec=sec.next;
        }
        int tempVal=first.val;
        first.val=sec.val;
        sec.val=tempVal;
        return head;
    }
}