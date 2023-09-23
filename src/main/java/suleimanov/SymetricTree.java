package suleimanov;

public class SymetricTree {


    public boolean isSymentric(TreeNode root) {
        return isSymentricInternal(root, root);
    }

    public boolean isSymentricInternal(TreeNode tn1, TreeNode tn2) {
        if (tn1 == null && tn2 == null) {
            return true;
        }
        if (tn1 == null || tn2 == null) {
            return false;
        }

        return (tn1.val == tn2.val)
                && isSymentricInternal(tn1.left, tn2.right)
                && isSymentricInternal(tn1.right, tn2.left);
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
