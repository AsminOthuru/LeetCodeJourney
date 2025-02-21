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
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;
        //find mid
        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        
        ListNode curr=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode next;

        //reverse
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        ListNode right=prev;
        ListNode left=head;
        ListNode RightNext;
        ListNode LeftNext;

        //zig zag 
        while( right != null && left != null ){

        RightNext= right.next;
        LeftNext= left.next;

            left.next = right;
            right.next = LeftNext;

            left = LeftNext;
            right = RightNext;

        }
       

    
        
    }
}