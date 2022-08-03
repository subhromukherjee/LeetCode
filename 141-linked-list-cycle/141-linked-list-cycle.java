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
//          Use two pointers, rabbit and tortoise.
//          tortoise moves step by step. rabbit moves two steps at time.
//          if the Linked List has a cycle tortoise and rabbit will meet at some
//          point.
        if(head == null) return false;
        ListNode tortoise = head;
        ListNode rabbit = head;
        while(rabbit.next!=null && rabbit.next.next!=null){
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
            if(rabbit == tortoise)  return true;
            
        }
        return false;
    }
}