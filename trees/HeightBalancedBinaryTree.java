package trees;


/*Height of every node of binary tree should be <=1 */
public class HeightBalancedBinaryTree {
    
    
    public static void main(String[] args) {
        TreeNode node = PreparedTree.setNode();

        System.out.println(isBalanced(node) != -1);
    
    }

    public static int isBalanced(TreeNode node) {
        if(node == null) return 0;
        int lh = isBalanced(node.left);
        if(lh == -1) return -1;
        int rh = isBalanced(node.right);
        if (rh == -1) return -1;

        if(Math.abs(rh - lh)> 1) return -1;
        else return Math.max(lh, rh) +1;

    }

    
}
