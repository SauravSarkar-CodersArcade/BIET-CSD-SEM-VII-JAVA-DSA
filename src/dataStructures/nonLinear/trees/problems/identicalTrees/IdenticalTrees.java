package dataStructures.nonLinear.trees.problems.identicalTrees;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class IdenticalTrees {
    public static boolean areIdentical(TreeNode t1, TreeNode t2){
        // Both are empty
        if(t1 == null && t2 == null){
            return true;
        }
        // One of them is empty
        if(t1 == null || t2 == null){
            return false;
        }
        // The data of the nodes are not same
        if(t1.data != t2.data){
            return false;
        }
        // Recursively check the left & right subtrees for both the trees
        return areIdentical(t1.left, t2.left) && areIdentical(t1.right, t2.right);
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        System.out.println(areIdentical(t1,t2) ? "Identical" : "Not Identical");
        TreeNode t3 = new TreeNode(1);
        t3.left = new TreeNode(2);
        t3.right = new TreeNode(3);

        TreeNode t4 = new TreeNode(1);
        t4.left = new TreeNode(2);
        t4.right = new TreeNode(5);
        System.out.println(areIdentical(t3,t4) ? "Identical" : "Not Identical");
    }
}
