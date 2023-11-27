package trees;

public class PreparedTree {

    public static TreeNode setNode() {
    TreeNode node = new TreeNode(10);
    node.left = new TreeNode(20);
    node.right = new TreeNode(30);
    node.left.left = new TreeNode(40);
    node.left.right = new TreeNode(50);
    node.right.left = new TreeNode(60);
    node.right.right = new TreeNode(70);
    node.left.left.left = new TreeNode(80);
    node.left.left.right = new TreeNode(90);
    node.left.right.left = new TreeNode(100);
    node.left.right.right = new TreeNode(110);
    node.right.left.left = new TreeNode(120);
    node.right.left.right = new TreeNode(130);   
    node.right.right.left = new TreeNode(140);
    node.right.right.right = new TreeNode(150);
    return node;
    }

    public static TreeNode setSumNode() {
    TreeNode node = new TreeNode(360);
    node.left = new TreeNode(100);
    node.right = new TreeNode(260);
    node.left.left = new TreeNode(30);
    node.left.right = new TreeNode(70);
    node.right.left = new TreeNode(110);
    node.right.right = new TreeNode(150);
    node.left.left.left = new TreeNode(10);
    node.left.left.right = new TreeNode(20);
    node.left.right.left = new TreeNode(30);
    node.left.right.right = new TreeNode(40);
    node.right.left.left = new TreeNode(50);
    node.right.left.right = new TreeNode(60);   
    node.right.right.left = new TreeNode(70);
    node.right.right.right = new TreeNode(80);
    return node;
    }

    public static TreeNode setBSTreeNode() {
    TreeNode node = new TreeNode(15);
    node.left = new TreeNode(7);
    node.right = new TreeNode(23);
    node.left.left = new TreeNode(3);
    node.left.right = new TreeNode(11);
    node.right.left = new TreeNode(19);
    node.right.right = new TreeNode(27);
    node.left.left.left = new TreeNode(1);
    node.left.left.right = new TreeNode(4);
    node.left.right.left = new TreeNode(9);
    node.left.right.right = new TreeNode(11);
    node.right.left.left = new TreeNode(17);
    node.right.left.right = new TreeNode(21);   
    node.right.right.left = new TreeNode(25);
    node.right.right.right = new TreeNode(29);
    return node;
    }
    
}
