package dataStructures.nonLinear.trees.traversals.bfs;
import java.util.LinkedList;
import java.util.Queue;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class LevelOrderTraversal {
    public static void levelOrderOrBFS(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode curr = queue.poll(); // Store the current node & remove
            System.out.print(curr.data + " ");
            // First push the left child into the queue
            if(curr.left != null){
                queue.add(curr.left);
            }
            // The push the right child into the queue
            if(curr.right != null){
                queue.add(curr.right);
            }
        }
        System.out.println();
    }
    public static int findHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        System.out.print("Level Order or BFS Traversal: ");
        levelOrderOrBFS(root);
        System.out.println("Height: " + findHeight(root));
    }
}
