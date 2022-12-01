package tree;

import java.util.*;

public class Tree {

    static List<Integer> result;
    static LinkedList<Integer> result1;

    public static void main(String[] args) {
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode root = new TreeNode(1,left,right);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        right.left = new TreeNode(6);
        right.right = new TreeNode(7);

        result = new ArrayList<>();
        System.out.println(("inorder traversal : " + inorderTraversal(root) ));

        result = new ArrayList<>();
        System.out.println(("preorder traversal : " + preorderTraversal(root) ));

        result1 = new LinkedList<>();
        //Reverse the process of preorder
        System.out.println(("postorder traversal : " + postorderTraversal(root) ));

        result = new ArrayList<>();
        System.out.println(("level order(BFS) traversal : " + bfs(root) ));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while(true) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            if(stack.isEmpty()) break;
            currentNode = stack.pop();
            result.add(currentNode.val);
            currentNode = currentNode.right;
        }
        return result;
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode = root;
        while(true) {
            while (currentNode != null) {
                result.add(currentNode.val);
                stack.push(currentNode);
                currentNode = currentNode.left;
            }
            if(stack.isEmpty()) break;
            currentNode = stack.pop();
            currentNode = currentNode.right;
        }
        return result;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        TreeNode currentNode = root;

        while(true) {
            while(currentNode != null) {
                stack.push(currentNode);
                result1.addFirst(currentNode.val);
                currentNode = currentNode.right;
            }
            if(stack.isEmpty()) break;
            TreeNode node = stack.pop();
            currentNode = node.left;
        }

        return result1;
    }

    public static List<Integer> bfs(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int tempSize = queue.size();
            while (tempSize > 0) {
                TreeNode current = queue.remove();
                result.add(current.val);
                if(current.left != null) queue.add(current.left);
                if(current.right != null) queue.add(current.right);
                tempSize--;
            }
        }
        return result;

    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;


    public TreeNode() {

    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left =  left;
        this.right = right;
    }

    @Override
    public boolean equals(Object o) {
        TreeNode treeNode = (TreeNode) o;
        return this.val == treeNode.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}