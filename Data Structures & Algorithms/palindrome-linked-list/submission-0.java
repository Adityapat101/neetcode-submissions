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
    public boolean isPalindrome(ListNode head) 
    {
        // if reverse linked list equals this linked list -> palindrome 

        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;
        ListNode dummy = null; 
        
        while (curr != null)
        {
            next = curr.next;
            ListNode newN = new ListNode(curr.val);
            newN.next = prev; 
            
            prev = newN;
            curr = next;
        }

        dummy = prev;



        while (dummy != null && head != null)
        {
            if(dummy.val != head.val)
            {
                return false;
            }
            else
            {
                dummy = dummy.next;
                head = head.next;
            }
        }

        return true;
    }
}