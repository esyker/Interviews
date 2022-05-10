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
/*
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
*/
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode iterator1 = list1;
        ListNode iterator2 = list2;
        ListNode head;
        if(list1==null)
            return list2;
        else if(list2 == null)
            return list1;
        if(list1.val<list2.val)
        {
            head = list1;
            iterator1 = iterator1.next;
        }
        else
        {
            head = list2;
            iterator2 = iterator2.next;
        }
        ListNode originalHead = head;
        ListNode newNode;
        while(iterator1 != null || iterator2!=null)
        {   
            if(iterator1!=null & iterator2!=null)
            {
                if(iterator1.val < iterator2.val)
                {   
                    newNode = iterator1;
                    iterator1 = iterator1.next;
                }
                else{
                    newNode = iterator2;
                    iterator2 = iterator2.next;
                }
            }
            else if(iterator1!=null)
            {
                newNode = iterator1;
                iterator1=iterator1.next;
            }
            else//iterator2!=null
            {
                newNode = iterator2;
                iterator2=iterator2.next;
            }
            head.next = newNode;
            head = head.next;
        }
        return originalHead;
    }
}