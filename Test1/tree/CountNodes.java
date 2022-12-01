package tree;

// Count Full Nodes , Half Nodes and Leaf Nodes

import java.util.LinkedList;
import java.util.Queue;

public class CountNodes {

    static int fullnodes = 0;
    static int halfnodes = 0;
    static int leafnodes = 0;

    public static void main(String args[]) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1, left, right);
        left.left = new TreeNode(4);
        right.left = new TreeNode(5, new TreeNode(7), null);
        right.right = new TreeNode(7, null, new TreeNode(8));

        countNodesRecursive(root);
        System.out.println("Full Nodes: " + fullnodes);
        System.out.println("Half Nodes: " + halfnodes);
        System.out.println("Leaf Nodes: " + leafnodes);

        fullnodes = 0;  halfnodes = 0;  leafnodes = 0;
        countNodesIterative(root);
        System.out.println("Full Nodes: " + fullnodes);
        System.out.println("Half Nodes: " + halfnodes);
        System.out.println("Leaf Nodes: " + leafnodes);
    }

    public static void countNodesRecursive(TreeNode root) {
        if(root == null) return;

        if(root.left != null && root.right != null){
            fullnodes++;
        } else if(root.left != null || root.right != null) {
            halfnodes++;
        }else if(root.left == null && root.right == null) {
            leafnodes++;
        }
        countNodesRecursive(root.left);
        countNodesRecursive((root.right));

    }

    public static void countNodesIterative(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {

            TreeNode current = queue.remove();
            if(current.left != null && current.right != null){
                fullnodes++;
                queue.add(current.left);
                queue.add(current.right);
            } else if(current.left != null || current.right != null) {
                halfnodes++;
                queue.add(current.left != null ? current.left : current.right);
            }else {
                leafnodes++;
            }
        }

    }
}
