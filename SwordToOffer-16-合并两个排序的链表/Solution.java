/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1==null||list2==null){
            return list1==null?list2:list1;
        }
        ListNode head=new ListNode(list1.val);
        ListNode list=new ListNode(list1.val<list2.val?list1.val:list2.val);
        head.next=list;
        while(list1 != null && list2 !=null){
            if(list1.val <= list2.val){
                list.next=new ListNode(list1.val);
                list=list.next;
                list1=list1.next;
            }
            else{
                list.next=new ListNode(list2.val);
                list=list.next;
                list2=list2.next;
            }
        }
        if(list1==null){
            while(list2!=null){
                list.next=new ListNode(list2.val);
                list=list.next;
                list2=list2.next;
            }
        }
        else{
            while(list1!=null){
                list.next=new ListNode(list1.val);
                list=list.next;
                list1=list1.next;
            }
        }
        return head.next.next;
    }
}