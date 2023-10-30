package trees;

public class ChildSumProperty {

    public static void main (String[] args) {

    TreeNode node = PreparedTree.setSumNode();
    System.out.println(isSum(node));
    
    }

    public static boolean isSum(TreeNode node) {

        if(node != null) {
            int sum = 0;
            if(node.left != null) {
                sum+=node.left.data;
                if (!isSum(node.left))
                    return false;
            }
            if(node.right != null) {
                sum+=node.right.data;
                if (!isSum(node.right))
                    return false;
            }
            if(node.data != sum && sum != 0)
                return false;
        }
        return true;
         
    }


}
