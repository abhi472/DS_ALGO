package trees;

public class TreeDepth {
    public static void main(String[] args) {
        TreeNode node = PreparedTree.setNode();
        System.out.print(treeDepth(node, 1));

    
    }

    public static int treeDepth(TreeNode node, int count) {
     int countLeft = node.left != null ? treeDepth(node.left, count+1) : count;
     int countRight = node.right!= null ? treeDepth(node.right, count+1): count;
     return countLeft>countRight? countLeft: countRight;
    }
}
