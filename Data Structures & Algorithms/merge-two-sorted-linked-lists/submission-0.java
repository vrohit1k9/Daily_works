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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=list1;
        if(list1==null){
            return list2;
        }
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=list2;
        ListNode temp1=list1;
        while(temp1!=null){
            ListNode temp2=temp1.next;
            while(temp2!=null){
                if(temp1.val>temp2.val){
                    int x=temp1.val;
                    temp1.val=temp2.val;
                    temp2.val=x;
                }
                temp2=temp2.next;
            }
            temp1=temp1.next;
        }
        return list1;
    }
}
