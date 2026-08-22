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

    public ListNode rev(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode forward = curr.next;
            curr.next = prev;
            prev = curr;
            curr = forward;
        }

        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Reverse both lists
        l1 = rev(l1);
        l2 = rev(l2);

        ListNode curr1 = l1;
        ListNode curr2 = l2;

        int carry = 0;

        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (curr1 != null || curr2 != null || carry != 0) {

            int sum = carry;

            if (curr1 != null) {
                sum += curr1.val;
                curr1 = curr1.next;
            }

            if (curr2 != null) {
                sum += curr2.val;
                curr2 = curr2.next;
            }

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            carry = sum / 10;
        }

        // Result was created in reverse order
        return rev(dummy.next);
    }
}