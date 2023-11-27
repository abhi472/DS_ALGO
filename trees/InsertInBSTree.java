package trees;

public class InsertInBSTree {

    public static void main(String[] args) {
       
        TreeNode node = PreparedTree.setBSTreeNode();
        if(insert(node, 2))
            TreeTraversal.printLevelLine(node);

    }
    public static boolean insert(TreeNode node, int x) {

        if (node.data > x)
            if (node.left != null)
                return insert(node.left, x);
            else 
            {
                node.left = new TreeNode(x);
                return true;
            }
        
        else if(node.data < x)
                if (node.right != null)
                    return insert(node.right, x);
                else 
                {
                    node.right = new TreeNode(x);
                    return true;
                }
        
        else return false;

    }

   

}
