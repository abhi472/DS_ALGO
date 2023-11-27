package trees;

public class SearchInBSTree {

    public static void main(String[] args) {
       
        TreeNode node = PreparedTree.setBSTreeNode();
        System.out.println(contains(node, 4));
    }
       

    public static boolean contains(TreeNode node, int x) {

        if (node == null)
            return false;
        if(node.data == x)
            return true;
        if(node.data > x)
            return contains(node.left, x);
        else return contains(node.right, x);

    }

}
