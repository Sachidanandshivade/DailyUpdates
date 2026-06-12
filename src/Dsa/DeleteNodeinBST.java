package Dsa;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class DeleteNodeinBST {

    public TreeNode deleteNode(TreeNode root, int key) {

        if(root == null) {
            return null;
        }

        if(key < root.val) {
            root.left = deleteNode(root.left, key);
        }
        else if(key > root.val) {
            root.right = deleteNode(root.right, key);
        }
        else {

            if(root.left == null) {
                return root.right;
            }

            if(root.right == null) {
                return root.left;
            }

            TreeNode successor = findMin(root.right);

            root.val = successor.val;

            root.right = deleteNode(root.right, successor.val);
        }

        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while(node.left != null) {
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(70);
        root.left.left = new TreeNode(20);
        root.left.right = new TreeNode(40);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        DeleteNodeinBST obj = new DeleteNodeinBST();

        root = obj.deleteNode(root, 50);

        inorder(root);
    }

    static void inorder(TreeNode root) {
        if(root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}