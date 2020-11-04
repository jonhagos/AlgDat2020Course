package AlgdatUke9;

import java.util.ArrayDeque;

public class Binarytree {

   static class BinarytreeNode{
        char value;
        BinarytreeNode left_child;
        BinarytreeNode right_child;

        BinarytreeNode(char value){
            this.value = value;
            this.left_child = null;
            this.right_child = null;
        }
        BinarytreeNode addLeftChild(char value){
            this.left_child = new BinarytreeNode(value);
            return left_child;

        }
        BinarytreeNode addRightChild(char value){
            this.right_child = new BinarytreeNode(value);
            return right_child;
        }
    }
    static void printLevelOrder(BinarytreeNode root){
        ArrayDeque<BinarytreeNode> queue = new ArrayDeque<BinarytreeNode>();

        queue.addLast(root);

        while(!queue.isEmpty()) {
            BinarytreeNode current = queue.removeFirst();

            //legg til current sine barn til køen
            if (current.left_child != null) {
                queue.addLast(current.left_child);
            }
            if (current.right_child != null) {
                queue.addLast(current.right_child);
            }
            System.out.print(current.value + ", ");
        }


}


    static void printPreOrder(BinarytreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value+ " ");
        printPreOrder(node.left_child);
        printPreOrder(node.right_child);
    }

    static void printInOrder(BinarytreeNode node){
        if(node == null){
            return;
        }

        printInOrder(node.left_child);
        System.out.print(node.value+ " ");
        printPreOrder(node.right_child);
    }

    static void printPostOrder(BinarytreeNode node){
        if(node == null){
            return;
        }
        System.out.print(node.value+ " ");
        printPostOrder(node.left_child);
        printPostOrder(node.right_child);
    }

    static void printDepthFirstNonRecursive(BinarytreeNode root){
       ArrayDeque<BinarytreeNode> stack = new ArrayDeque<BinarytreeNode>();

       stack.addLast(root);

       while(!stack.isEmpty()){
           BinarytreeNode current = stack .removeLast();


       }
    }
    public static void main(String[] args) {

        BinarytreeNode root = new BinarytreeNode('A');

        BinarytreeNode b = root.addLeftChild('B');
        BinarytreeNode c = root.addRightChild('C');

        BinarytreeNode d = b.addLeftChild('D');
        BinarytreeNode e = b.addRightChild('E');

        BinarytreeNode f = c.addLeftChild('F');
        BinarytreeNode g = c.addRightChild('G');

       // printLevelOrder(root);
        System.out.println("pre order");
        printPreOrder(root);
        System.out.println();

        System.out.println("Inorder");
        printInOrder(root);
        System.out.println();

        System.out.println("Post order");
        printPostOrder(root);
        System.out.println();

    }
}
