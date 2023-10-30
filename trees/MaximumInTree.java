package trees;

public class MaximumInTree {
    
    public static void main(String[] args) {
        TreeNode node = PreparedTree.setNode();

        System.out.print(printMax(node));
    
    }

    public static int printMax(TreeNode node) {

        if(node != null) {
            return Math.max(node.data, Math.max(printMax(node.left), printMax(node.right)));
        } else return Integer.MIN_VALUE;

    }

}
