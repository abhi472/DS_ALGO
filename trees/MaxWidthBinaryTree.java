package trees;

import java.util.LinkedList;
import java.util.Queue;

public class MaxWidthBinaryTree {

    public static void main(String args[]) {
        TreeNode treeNode = PreparedTree.setNode();
        System.out.println(maxWidth(treeNode));

    }

     public static int maxWidth(TreeNode node) {
        Queue<TreeNode> queNodes = new LinkedList<TreeNode>();
        int max = 0;
        queNodes.add(node);
        while (queNodes.isEmpty() == false) {
            int count = queNodes.size();
            max  = max>count?max:count;
            for (int i = 0; i< count; i++) {
            TreeNode n = queNodes.poll();
            
            
            if(n.left != null) {
                queNodes.add(n.left);
            } 
            if (n.right != null) {
                queNodes.add(n.right);
            }
        }
        }
        return max;
    }
    
}
