package Nov_14_24;

/**
 * Definition for a binary tree node.
 * public class Nov_14_24.TreeNode {
 *     int val;
 *     Nov_14_24.TreeNode left;
 *     Nov_14_24.TreeNode right;
 *     Nov_14_24.TreeNode() {}
 *     Nov_14_24.TreeNode(int val) { this.val = val; }
 *     Nov_14_24.TreeNode(int val, Nov_14_24.TreeNode left, Nov_14_24.TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class ValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    static boolean isValid(TreeNode root, long minVal, long maxVal) {
        if (root == null) return true;
        if (root.val <= minVal || root.val >= maxVal) return false;
        return (isValid(root.left, minVal, root.val) && isValid(root.right, root.val, maxVal));
    }

    public static void main(String[] args) {
        // Example Binary Tree
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        ValidBST solution = new ValidBST();
        boolean result = solution.isValidBST(root);

        if (result) {
            System.out.println("The given binary tree is a valid BST.");
        } else {
            System.out.println("The given binary tree is not a valid BST.");
        }
    }
}

// Definition for Nov_14_24.TreeNode class
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
