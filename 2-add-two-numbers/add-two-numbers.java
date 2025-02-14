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
import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder num1 = new StringBuilder();
        StringBuilder num2 = new StringBuilder();

        
        while (l1 != null) {
            num1.append(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            num2.append(l2.val);
            l2 = l2.next;
        }

        
        BigInteger number1 = new BigInteger(num1.reverse().toString());
        BigInteger number2 = new BigInteger(num2.reverse().toString());

        
        BigInteger sum = number1.add(number2);

        
        
        String sumStr = new StringBuilder(sum.toString()).reverse().toString();
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        for (char c : sumStr.toCharArray()) {
            current.next = new ListNode(c - '0');
            current = current.next;
        }

        return dummyHead.next;
    }
}
