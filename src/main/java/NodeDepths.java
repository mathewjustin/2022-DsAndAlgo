public class NodeDepths {

    public static int nodeDepths(NodeDepths.BinaryTree root) {
        // Write your code here.
          return depthSum(root,0);
    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static int depthSum(NodeDepths.BinaryTree node, int parentDepth)
    {
        if (node == null)
            return 0;

        /* first recur on left child */
        return parentDepth+ depthSum(node.left,parentDepth+1 )+ depthSum(node.right,parentDepth+1);



    }

    public static void main(String[] args) {

        NodeDepths.BinaryTree tree =new NodeDepths.BinaryTree(1);
        tree.left=new NodeDepths.BinaryTree(2);
        tree.left.left=new NodeDepths.BinaryTree(4);
        tree.left.left.left=new NodeDepths.BinaryTree(8);

        tree.left.left.right=new NodeDepths.BinaryTree(9);
        tree.left.right=new NodeDepths.BinaryTree(5);
        tree.left.right.left=new NodeDepths.BinaryTree(10);

        tree.right=new NodeDepths.BinaryTree(3);
        tree.right.left=new NodeDepths.BinaryTree(6);
        tree.right.right=new NodeDepths.BinaryTree(7);


        System.err.println(nodeDepths(tree));
    }
}
