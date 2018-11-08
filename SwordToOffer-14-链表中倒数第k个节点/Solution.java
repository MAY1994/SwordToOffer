
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        int len = 0;
        ListNode tmp = head;
        while(tmp != null){
            len++;
            tmp=tmp.next;
        }
        if(k>len)
            return null;
        for(int i=0;i<len-k;i++){
            head=head.next;
        }
        return head;
    }
}