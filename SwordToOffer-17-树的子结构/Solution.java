/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if(root1==null || root2==null)
            return false;
        if(root1.val==root2.val){
            if(Subtree(root1.left,root2.left) && Subtree(root1.right,root2.right))
            	return true;
            else
            	return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
        }
        else
            return HasSubtree(root1.left,root2) || HasSubtree(root1.right,root2);
    }
    static boolean Subtree(TreeNode root1,TreeNode root2) {
        if(root2==null)
            return true;
        if(root1==null)
            return false;
        if(root1.val==root2.val){
            return(Subtree(root1.left,root2.left) && Subtree(root1.right,root2.right));
        }
        else
            return false;
    }
}