/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode fast = head;
        ListNode slow = head;
        
        if (head == null) return false;
        
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;                                     //Increment slow pointer by 1 and fast by 2. 
            fast = fast.next.next;                                //If no cycle in list fast will eventually equal to null
            if (slow == fast) {                                   //If cycle in list fast and slow will eventually overlap and become equal
                return true;
            }
        }
        return false;
    }
}
