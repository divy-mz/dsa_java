/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static boolean sameTree(TreeNode p,TreeNode q){
        if(p==null && q==null ) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        if(!sameTree(p.left,q.right)) return false;
        if(!sameTree(p.right,q.left)) return false;
        return true;
    }
    public boolean isSymmetric(TreeNode root) {
        boolean ans=sameTree(root.left,root.right);
        return ans;
        
    }
}