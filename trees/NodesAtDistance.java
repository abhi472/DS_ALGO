package trees;

public class NodesAtDistance {
    
    public static void main(String[] args) {
        TreeNode node = PreparedTree.setNode();
        nodesAtK(node, 1, 4);

    
    }

    public static int nodesAtK(TreeNode node, int count, int k) {
     int countLeft = node.left != null ? nodesAtK(node.left, count+1, k) : count;
     int countRight = node.right!= null ? nodesAtK(node.right, count+1, k): count;
     if (count == k)
        System.out.print(node.data + " ");
     return countLeft>countRight? countLeft: countRight;
    }
}
