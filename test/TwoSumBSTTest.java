import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumBSTTest {

    @Test
    public void findTarget() {
        TreeNode node = new TreeNode(2);
        TreeNode a = new TreeNode(0);
        a.left = new TreeNode(-4);
        a.right = new TreeNode(1);
        node.left = a;
        node.right = new TreeNode(3);
        TwoSumBST sumBST = new TwoSumBST();
        System.out.println("result: " + sumBST.findTarget(node, -1));

    }
}