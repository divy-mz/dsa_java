/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        int aLen=0;
        int bLen=0;
        int diff;
        while(a!=null){
            aLen++;
            a=a.next;
        }
        while(b!=null){
            bLen++;
            b=b.next;
        }
        if(aLen>bLen){
            diff=aLen-bLen;
            while(diff-->0){
                headA=headA.next;
            }
        }
        else{
            diff=bLen-aLen;
            while(diff-->0){
                headB=headB.next;
            }
        }
        while(headA!=null && headB!=null){
            if(headA==headB){
                return headA;
            }
            else{
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;

    }
}