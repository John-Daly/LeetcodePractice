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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        while (current != null) {
            if (current.next == null) {               //Prevents Null Pointer Exception error
                break;
            }
            
            if (current.val == current.next.val) {    //If current value is the same as the next value
                current.next = current.next.next;     //Skip the next value and point node to value after the next value. The next next.
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
