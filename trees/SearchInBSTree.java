package trees;

public class SearchInBSTree {

    public static void main(String[] args) {
       
        TreeNode node = PreparedTree.setBSTreeNode();
        System.out.println(containsIterative(node, 4));
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

    public static boolean containsIterative(TreeNode node, int x) {

        while (node != null) {
            if(node.data == x)
                return true;
            else if(node.data > x)
                node = node.left;
            else node = node.right;
        }

        return false;
    }

}
