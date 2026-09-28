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
        // floyd worshell.... hare and tortoise like a middle of linkedlist 
        ListNode fast = head;
        ListNode slow =head;
        while(slow != null && fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
            if(slow == fast){
                return true;
            }
        }
         return false;
    }
}