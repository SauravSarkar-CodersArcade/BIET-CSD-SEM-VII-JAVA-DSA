package dataStructures.nonLinear.trees.problems.evenGrandParentSum;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class Main {
    public static void dfs(TreeNode node, TreeNode parent,
                           TreeNode grandParent, int[] sum){
        if(node == null){
            return;
        }
        if(grandParent != null && grandParent.data % 2 == 0){
            sum[0] += node.data;
        }
        // Traverse left
        dfs(node.left, node, parent, sum);
        // Traverse right
        dfs(node.right, node, parent, sum);
    }
    public static int sumOfEvenGrandParents(TreeNode root){
        int[] sum = new int[1]; // Array with size 1
        dfs(root, null, null, sum);
        return sum[0];
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(7);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(9);
        root.left.right.left = new TreeNode(1);
        root.left.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(5);
        int result = sumOfEvenGrandParents(root);
        System.out.println("Sum of the nodes with even grandparents: " +
                result);
    }
}
