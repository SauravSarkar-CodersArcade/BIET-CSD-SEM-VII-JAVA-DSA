package dataStructures.nonLinear.bst;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinarySearchTree {
    public static void inOrder(TreeNode root){
        if(root != null){
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    static TreeNode insert(TreeNode root, int key){
        // If the tree is empty
        if(root == null){
            return new TreeNode(key); // Make the new node the root node & return
        }
        if(key < root.data){
            root.left = insert(root.left, key);
        }else if(key > root.data){
            root.right = insert(root.right, key);
        }
        return root;
    }
    static TreeNode search(TreeNode root, int key){
        // 1. If the tree is empty // 2. If the key is at the root node
        if(root == null || root.data == key){
            return root;
        }
        if(root.data < key){
            return search(root.right, key);
        }
        return search(root.left, key);
    }
    static TreeNode findMin(TreeNode root){
        if (root == null){
            return root;
        }
        TreeNode curr = root;
        while (curr != null && curr.left != null){
            curr = curr.left; // Keep travelling to the extreme left for the min value
        }
        return curr;
    }
    static TreeNode deleteNode(TreeNode root, int key){
        if(root == null){
            return root;
        }
        if(key < root.data){
            root.left = deleteNode(root, key);
        }else if(key > root.data){
            root.right = deleteNode(root, key);
        }else{
            // Case if the root has only one child
            if(root.left == null){
                TreeNode temp = root.right;
                root = null;
                return temp;
            }else if(root.right == null){
                TreeNode temp = root.left;
                root = null;
                return temp;
            }
            // If the root node has both the children
            // We find the in-order successor of the root node
            // The in-order successor is the least value of the right subtree
            // We replace the root with the in-order successor
            // Then we delete the temporary value from the right subtree
            // We don't take the in-order predecessor because it involves complex restructuring
            TreeNode temp = findMin(root.right);
            root.data = temp.data;
            root.right = deleteNode(root.right, temp.data);
        }
        return root;
    }
    public static void main(String[] args) {
        TreeNode root = null;
        root = insert(root, 50);
        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();
        insert(root, 20);
        insert(root,58);
        insert(root,70);
        insert(root,45);
        System.out.print("InOrder: ");
        inOrder(root);
        System.out.println();
        TreeNode result1 = search(root, 70);
        if(result1 == null){
            System.out.println("Key 70 Not found.");
        }else {
            System.out.println("key 70 found.");
        }
        TreeNode result2 = search(root, 7);
        if(result2 == null){
            System.out.println("Key 7 Not found.");
        }else {
            System.out.println("key 7 found.");
        }
        root = deleteNode(root, 50);
        System.out.print("InOrder after deleting root: ");
        inOrder(root);
        System.out.println();
        System.out.println("New Root: " + root.data);
    }

}
