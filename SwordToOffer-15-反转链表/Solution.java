/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;
        ListNode pre=head;
        ListNode curr = head.next;
        ListNode next=curr.next;
        pre.next=null;
        curr.next=pre;
        while(next !=null){
            pre=curr;
            curr=next;
            next=next.next;
            curr.next=pre;
        }
        return curr;
    }
}