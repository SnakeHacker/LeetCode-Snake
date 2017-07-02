/**
 * Created by Snake on 2017/7/2.
 * Given a binary tree, find its maximum depth.
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int leftdp = maxDepth(root.left);
        int rightdp = maxDepth(root.right);

        if (leftdp > rightdp){
            return leftdp+1;
        }else {
            return rightdp+1;
        }

    }

}
