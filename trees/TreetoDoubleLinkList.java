package trees;

import linkedList.java.Node;

public class TreetoDoubleLinkList {

    public static void main (String args[]) {
        TreeNode node = PreparedTree.setNode();
        Node nodel = convert(node, null);
        while(nodel != null) {
            System.out.print(nodel.data+ " ");
            nodel = nodel.prev;
        }
        

    }

    private static Node convert(TreeNode treeNode, Node node) {
        if(treeNode != null) {
            node = convert(treeNode.left, node);
            if (node == null) {
                node = new Node(treeNode.data); 
            } else {
                node.next = new Node(treeNode.data);
                node.next.prev = node;
                node = node.next;
            } node = convert(treeNode.right, node);
        }
        return node;
        

        
    }
    
}
