/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if(pre.length == 1) {
			TreeNode root = new TreeNode(pre[0]);
			root.left =null;
			root.right = null;
			return root;
		}
		if(pre.length == 0) {
			return null;
		}
        TreeNode root = new TreeNode(pre[0]);
        int idx =search(in,root.val);
        int leftpre[] = new int[idx];
        int rightpre[] = new int[pre.length-idx-1];
        int leftin[] = new int [idx];
        int rightin[] = new int [pre.length-idx-1];
        for(int i=0;i<idx;i++) {
        	leftpre[i] = pre[i+1];
        }
        for(int i=0;i<pre.length-idx-1;i++) {
        	rightpre[i] = pre[idx+1+i];
        }
        for(int j=0;j<idx;j++) {
        	leftin[j] = in[j];
        }
        for(int j=0;j<pre.length-idx-1;j++) {
        	rightin[j] = in[idx+j+1];
        }
        root.left = reConstructBinaryTree(leftpre,leftin);
        root.right=reConstructBinaryTree(rightpre,rightin);
        return root;
    }
	int search(int [] in,int x) {
		for(int i=0;i<in.length;i++) {
			if(x==in[i])
				return i;
		}
		return 0;
	}
}