import java.util.Stack;

public class TwoSumBST {

    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack();

        if (root == null) {
            return false;
        }
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.val < k && curr.right != null) {
                stack.push(curr.right);
            }
            if (k - curr.val != curr.val) {
                if (contain(root, k - curr.val)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean contain(TreeNode root, int n) {
        System.out.println("find "+n);
        if (root == null) {
            return false;
        }
        if (root.val == n) {
            return true;
        }
        if (root.val < n) {
            return contain(root.right, n);
        }
        if (root.val > n) {
            return contain(root.left, n);
        }
        return false;
    }


}

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
