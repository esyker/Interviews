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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode();
        ListNode aux = newHead;
        int val1;
        int val2;
        int carry = 0;
        while(l1!= null || l2!=null || carry != 0)
        {   
            val1 = 0;
            val2 = 0;
            if(l1!=null)
            {
                val1 = l1.val;
                l1 = l1.next;
            }  
            if(l2 != null)
            {
                val2 = l2.val;
                l2 = l2.next;
            }
            aux.val = (val1+val2+carry)%10;
            carry = (val1+val2+carry)/10;
            if(l1!= null || l2!= null || carry != 0)
            {   
                aux.next = new ListNode();
                aux = aux.next;
            }
        }
        return newHead;
    }
}