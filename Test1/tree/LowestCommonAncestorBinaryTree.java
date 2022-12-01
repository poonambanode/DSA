package tree;

import tree.TreeNode;

public class LowestCommonAncestorBinaryTree {


    public static void main(String args[]) {
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(1);
        TreeNode root = new TreeNode(3,left,right);
        left.left = new TreeNode(6);
        left.right = new TreeNode(2, new TreeNode(7),new TreeNode(4));
        right.left = new TreeNode(9);
        right.right = new TreeNode(8);

        TreeNode p = new TreeNode(6);
        TreeNode q = new TreeNode(4);

        TreeNode ancestor = lowestCommonAncestor(p,q,root);

        System.out.println("Lowest Common Ancestor Of 6 and 4 is: "+ ancestor.val);

    }

    public static TreeNode lowestCommonAncestor(TreeNode p, TreeNode q, TreeNode root) {
        if (root == null) return null;

        if(root.equals(p) || root.equals(q)) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(p, q, root.left);
        TreeNode right = lowestCommonAncestor(p, q, root.right);

        if(left != null && right != null) {
            return root;
        }
        return  (left != null) ? left : right;

    }
}
