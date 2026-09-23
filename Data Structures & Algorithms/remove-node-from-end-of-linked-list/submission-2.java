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
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;


        int count = 0;
        
    // reverse then remove 
        while (curr != null)
        {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

//
        ListNode s = prev;
        ListNode prev2 = null;
        ListNode second = null;

    while (s != null)
    {

        if(n - 1 == count)
        {
            second = s.next;
            if(prev2 == null)
            {
                prev = second;
            }
            else
            {
                prev2.next = second;
            }
        }

        prev2 = s;
        count++;
        s = s.next;
    }


        ListNode next2 = null;
        ListNode prev3 = null;
        ListNode curr2 = prev;

         while (curr2 != null)
        {
            next2 = curr2.next;
            curr2.next = prev3;

            prev3 = curr2;
            curr2 = next2;
        }
        
        return prev3;
        
    }
}
