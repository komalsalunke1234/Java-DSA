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
    TreeNode first=null;
        TreeNode prev=null;

    TreeNode second=null;

    TreeNode middle=null;

    public void recoverTree(TreeNode root) {
        inorder(root);
        if(second!=null){
            int temp=first.val;
            first.val=second.val;
            second.val=temp;

        }
        else{
            int temp=first.val;
            first.val=middle.val;
            middle.val=temp;
        }
        
    }
    private void inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);

        if(prev!=null &&  prev.val>root.val){
            if(first==null){
                first=prev;
                middle=root;
            }
            else{
                second=root;
            }
        }
        prev=root;
        inorder(root.right);
    }
}