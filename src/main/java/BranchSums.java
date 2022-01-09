import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BranchSums {
    //Input is a binary tree.
    //output is the list of its branch sums ordered from leftmost branch sum to rightmost branch sum.


    public static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer>  InorderBranchSum(BinaryTree node,int sum,List<Integer>listOfBranchSum)
    {
        if (node == null)
             return listOfBranchSum;

         if(node.left!=null || node.right!=null)
        {
            sum=sum+node.value;
        }else
        {
            listOfBranchSum.add(sum+node.value);
         }
        /* first recur on left child */
        InorderBranchSum(node.left,sum, listOfBranchSum);

        /* then print the data of node */

        /* now recur on right child */
        InorderBranchSum(node.right,sum,listOfBranchSum);
        return listOfBranchSum;
    }

    public static List<Integer> branchSums(BinaryTree root) {
        // Write your code here.
      List<Integer>listOfBranchSum=  new ArrayList<Integer>();
       return InorderBranchSum(root,0,listOfBranchSum);

    }

    public static void main(String[] args) {

        BinaryTree tree =new BinaryTree(1);
        tree.left=new BinaryTree(2);
        tree.left.left=new BinaryTree(4);
        tree.left.left.left=new BinaryTree(8);

        tree.left.left.right=new BinaryTree(9);
        tree.left.right=new BinaryTree(5);
        tree.left.right.left=new BinaryTree(10);

        tree.right=new BinaryTree(3);
        tree.right.left=new BinaryTree(6);
        tree.right.right=new BinaryTree(7);


        System.err.println(branchSums(tree));
    }
}
