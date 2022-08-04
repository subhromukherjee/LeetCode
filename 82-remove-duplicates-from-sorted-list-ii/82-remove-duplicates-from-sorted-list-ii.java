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
            //use two pointers, slow - track the node before the dup nodes, 
	// fast - to find the last node of dups.
            ListNode slow = null;
            ListNode fast = head;
            while(fast != null && fast.next != null){
                if(fast.val != fast.next.val){
                    slow = fast;
                    fast = fast.next;
                }else{
                    while(fast.next != null && fast.next.val == fast.val){
                        fast = fast.next;  //while loop to find the last node of the dups.
                    }
                    if(slow != null){   //duplicates detected.
                         slow.next = fast.next; //remove the dups.
                    }else{
                        head = fast.next;
                    }
                    fast = fast.next;
                }
            }
            return head;
    }
    
}