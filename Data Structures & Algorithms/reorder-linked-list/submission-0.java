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

class Solution 
{
    public void reorderList(ListNode head) 
    {
        
        //Find Middle 
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = second;
        
        // Reverse second half 
        while(curr != null)
        {
            ListNode next = curr.next;
            curr.next = prev; 

            prev = curr;
            curr = next;
        }

        curr = prev;
        ListNode first = head;

        // curr : 1 -> 2 -> 3 -> null

        // 4 -> 5 -> null


        // Insert second half into first half 
        while (curr != null)
        {
            ListNode s1 = first.next;
            ListNode s2 = curr.next;

            curr.next = s1;
            first.next = curr;

            curr = s2;
            first = s1;
        }
    }
}
