/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> ret = new ArrayList<Integer>();
        while(listNode != null) {
        	al.add(listNode.val);
        	listNode=listNode.next;
        }
        for(int i=0;i<al.size();i++) {
        	ret.add(al.get(al.size()-i-1));
        }
        return ret;
    }
}