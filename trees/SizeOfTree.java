package trees;

public class SizeOfTree {
    
    public static void main(String[] args) {
        TreeNode node = PreparedTree.setNode();
        System.out.print(printCount(node));
    
    }

    public static int printCount(TreeNode node) {

        if(node != null) {
            return 1+ printCount(node.left) + printCount(node.right);
        } else return 0;

    }
}
