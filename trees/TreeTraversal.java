package trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {
    public static void main(String[] args) {
        TreeNode node = PreparedTree.setNode();
        // printIn(node);
        // System.out.println("");
        // printPre(node);
        // System.out.println("");
        // printPost(node);
        // System.out.println("");
        // printLevel(node);
        // System.out.println("");
        printTopView(node);

    }

    public static void printIn(TreeNode node) {
        if (node != null) {
            printIn(node.left);
            System.out.print(node.data+" ");
            printIn(node.right);
        }


    }

    public static void printPre(TreeNode node) {
        if (node != null) {
            System.out.print(node.data+" ");
            printPre(node.left);
            printPre(node.right);
        }


    }

    public static void printPost(TreeNode node) {
        if (node != null) {
            printPost(node.left);
            printPost(node.right);
            System.out.print(node.data+" ");
            
        }
    }

    public static void printLevel(TreeNode node) {
        Queue<TreeNode> queNodes = new LinkedList<TreeNode>();
        queNodes.add(node);
        while (queNodes.isEmpty() == false) {
            TreeNode n = queNodes.poll();
            System.out.print(n.data + " ");
            if(n.left != null) {
                queNodes.add(n.left);
            }
            if (n.right != null) {
                queNodes.add(n.right);
            }
        }
    }

     public static void printLevelLine(TreeNode node) {
        Queue<TreeNode> queNodes = new LinkedList<TreeNode>();
        queNodes.add(node);
        while (queNodes.isEmpty() == false) {
            int count = queNodes.size();
            
            for (int i = 0; i< count; i++) {
            TreeNode n = queNodes.poll();
            
            
            if(n.left != null) {
                queNodes.add(n.left);
            } 
            System.out.print(n.data + " ");
            if (n.right != null) {
                queNodes.add(n.right);
            }
        }
        System.out.println("");
        }
    }

     public static void printLeftView(TreeNode node) {
        Queue<TreeNode> queNodes = new LinkedList<TreeNode>();
        queNodes.add(node);
        while (queNodes.isEmpty() == false) {
            int count = queNodes.size();
            
            for (int i = 0; i< count; i++) {
            TreeNode n = queNodes.poll();
            if(i == 0)
                System.out.print(n.data + " ");
            
            if(n.left != null) {
                queNodes.add(n.left);
            } else
            if (n.right != null) {
                queNodes.add(n.right);
            }
        }
         }
    }

    private static void treadTree(TreeNode node, TreeNode[] nodes, int mid) {
        if (node != null) {
        if(nodes[mid] == null)
        if(nodes[mid - 1] == null)
        nodes[mid - 1] = node.left;
        if(nodes[mid + 1] == null)
        nodes[mid + 1] = node.right;
        treadTree(node.left, nodes, mid - 1);
        treadTree(node.right, nodes, mid + 1);
        }

    }

    public static void printTopView(TreeNode node) {
        int height = TreeDepth.treeDepth(node, 1);
        int size = (int) Math.pow(2, height);
        TreeNode nodes[]= new TreeNode[size];
        int mid = size/2;
        treadTree(node, nodes, mid);
        for (int i = 0; i< size - 1; i++) {
        
            if (nodes[i] != null)
            System.out.print(nodes[i].data + " ");
        }
       
    }
    
}
