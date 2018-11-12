import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args){
    	ListNode ln =new ListNode(1);
    	ln.next=new ListNode(1);
    	ln.next.next=new ListNode(2);
    	ln.next.next.next=new ListNode(3);
    	ln.next.next.next.next=new ListNode(3);
    	ln.next.next.next.next.next=new ListNode(4);
    	ln.next.next.next.next.next.next=new ListNode(5);
    	ln.next.next.next.next.next.next.next=new ListNode(5);
    	ListNode pri=deleteDuplication(ln);
    	while(pri != null) {
    		System.out.println(pri.val);
    		pri=pri.next;    	
    	}
    }
    
    /**
     * 修改了原始链表
     * @param pHead
     * @return
     */
    public static ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next==null) return pHead;
        ListNode tmp=pHead.next;
        if(pHead.val != tmp.val) {
        	pHead.next=deleteDuplication(tmp);
        	return pHead;
        }
        while(tmp != null && tmp.val == pHead.val) {
        	tmp=tmp.next;
        }
        return deleteDuplication(tmp);
    }
}
class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}
