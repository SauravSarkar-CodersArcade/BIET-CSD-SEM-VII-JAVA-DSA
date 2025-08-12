package dataStructures.nonLinear.trees.problems.lca;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class LowestCommonAncestor {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        // root is null or root is p or root is q
        if(root == null || root == p || root == q){
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // If both left & right are not null, return the root node
        if(left != null && right != null){
            return root;
        }
        // If either of them is null, return the non-null child
        return (left != null) ? left : right;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        TreeNode node4 = root.left.left;
        TreeNode node5 = root.left.right;
        TreeNode node3 = root.right;

        TreeNode lca1 = lowestCommonAncestor(root, root, node3); // 1
        TreeNode lca2 = lowestCommonAncestor(root, node4, node5); // 2
        System.out.println(lca1.data);
        System.out.println(lca2.data);
    }
}
