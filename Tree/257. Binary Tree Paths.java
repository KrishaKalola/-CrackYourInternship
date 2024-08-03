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
    public List<String> binaryTreePaths(TreeNode root) {
     List<String> s=new ArrayList<>();
     String subs="";
     paths(root,s,subs);
    return s;
    }
    public static void paths(TreeNode root , List<String> s,String subs)
    {   
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            subs+=root.val;
            s.add(subs);
            subs="";
            return ;
        }
        subs+=root.val+"->";
        paths(root.left,s,subs);
        paths(root.right,s,subs);
    }
}