package javaTut;

// import java.util.LinkedList;
// import java.util.Queue;

public class _38BinaryTree {

  // static class Node {
  // int data;
  // Node left, right;

  // Node(int data) {
  // this.data = data;
  // this.left = null;
  // this.right = null;
  // }
  // }

  // static class BinaryTree {
  // static int idx = -1;

  // public static Node buildTree(int nodes[]) {
  // idx++;
  // if (nodes[idx] == -1)
  // return null;

  // Node newNode = new Node(nodes[idx]);
  // newNode.left = buildTree(nodes);
  // newNode.right = buildTree(nodes);

  // return newNode;
  // }
  // }

  // public static void preorder(Node root) {
  // if (root == null) {
  // System.out.print("-1 ");
  // return;
  // }
  // System.out.print((root.data + " "));
  // preorder(root.left);
  // preorder(root.right);
  // }

  // public static void inorder(Node root) {
  // if (root == null) {
  // System.out.print("-1 ");
  // return;
  // }
  // inorder(root.left);
  // System.out.print((root.data + " "));
  // inorder(root.right);
  // }

  // public static void postorder(Node root) {
  // if (root == null) {
  // System.out.print("-1 ");
  // return;
  // }
  // postorder(root.left);
  // postorder(root.right);
  // System.out.print((root.data + " "));
  // }

  // public static void levelOrder(Node root, int k) {
  // int sum = 0, level = 1;

  // if (root == null)
  // return;

  // Queue<Node> q = new LinkedList<>();
  // q.add(root);
  // q.add(null);

  // while (!q.isEmpty()) {
  // Node currNode = q.remove();
  // if (currNode == null) {
  // System.out.print(k == level ? "\t" + sum : "");
  // System.out.println();
  // level++;
  // sum = 0;

  // if (q.isEmpty())
  // break;
  // else
  // q.add(null);
  // } else {
  // System.out.print(currNode.data + " ");
  // sum += currNode.data;
  // if (currNode.left != null)
  // q.add(currNode.left);
  // if (currNode.right != null)
  // q.add(currNode.right);
  // }
  // }

  // }

  // public static int count(Node root) {
  // if(root==null)return 0;

  // return
  // count(root.left) + count(root.right) + 1;

  // }

  public static void main(String[] args) {

    /*
     * Binary Tree is a form of Data Structure that helps us to store a particular
     * data in the form of hierarchical form where top data is called as Root and
     * the data having no child is called Leaf
     * 
     * Time Complexity is O(n)
     */

    /*
     * In Binary Tree, Root or any data (Node) can have maximum of only 2 child.
     * Left side Node is called Left child while Right side Node is called Right
     * Child.
     * 
     * If there is no child at Left/Right then we call that child as Null
     */

    /*
     * We can create Binary Tree with an simple array, where first element is called
     * Root and further elements constitute as Root's child.
     * 
     * In assigning child we first assign Left child and then Right child.
     * 
     * And array[i] == -1, then we assume that there is Null and move to another
     * Child
     */

    // int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

    // BinaryTree tree = new BinaryTree();
    // Node root = tree.buildTree(nodes);

    // System.out.println(root.data);

    // Traverses
    /*
     * Traversal means how to traverse in a Binary Tree.
     * There are many types of Traverses:-
     * 
     * Preorder Traversal:-
     * First Root,
     * then Left Subtree,
     * then Right Subtree and so on Recursively ....
     * 
     * Inorder Traversal:-
     * First Left Subtree,
     * then Root,
     * then Right Subtree and so on Recursively ....
     * 
     * Postorder Traversal:-
     * First Left Subtree,
     * then Right Subtree,
     * then Root and so on Recursively ....
     * 
     * // In all Pre-In-Post order all traversals are DFS(Depth wali first) and In
     * Level order traversals are BFS (Breadth wali first)
     * 
     * Levelorder Traversal:-
     * Here we will use Queue to print Level wise Data as Queue has property of FIFO
     * (First - IN - First - OUT)
     */

    // preorder(root);
    // inorder(root);
    // postorder(root);
    // levelOrder(root);
    // levelOrder(root, 2); /* To print the sum of all numbers in given Level */
    // System.out.println(count(root)); // Number of Nodes
    // System.out.println(countData(root)); // Sum of data of Nodes
    // System.out.println(height(root)); // Levels of Nodes
    // Diameter of a Tree is Number of Nodes in the Longest path between any 2 nodes
    // System.out.println(dia(root));
    // System.out.println(dia2(root).dia);
  }

  // Solution to check a Sample Tree is subtree of Given Tree
  // static class Solution {

  // public boolean isIdentical(Node root, Node subRoot) {
  // if (root == null && subRoot == null)
  // return true;
  // if (root == null || subRoot == null)
  // return false;

  // if (root.data == subRoot.data) {
  // return isIdentical(root.left, subRoot.left) && isIdentical(root.right,
  // subRoot.right);
  // } else
  // return false;
  // }

  // public boolean isSubTree(Node root, Node subRoot) {
  // if (subRoot == null) {
  // return true;
  // }
  // if (root == null) {
  // return false;
  // }

  // if (root.data == subRoot.data) {
  // if (isIdentical(root, subRoot)) {
  // return true;
  // }
  // }
  // return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
  // }
  // }

  // static class TreeInfo {
  // int ht;
  // int dia;

  // TreeInfo(int ht, int dia) {
  // this.ht = ht;
  // this.dia = dia;
  // }
  // }

  // // O(n)
  // public static TreeInfo dia2(Node root) {
  // if (root == null)
  // return new TreeInfo(0, 0);

  // TreeInfo left = dia2(root.left),
  // right = dia2(root.right);

  // int myHi = Math.max(left.ht, right.ht) + 1;

  // int dia1 = left.dia,
  // dia2 = right.dia,
  // dia3 = left.ht + right.ht + 1;

  // int myDia = Math.max(Math.max(dia1, dia2), dia3);

  // return new TreeInfo(myHi, myDia);
  // }

  // public static int dia(Node root) {
  // /* O(n2) */
  // if (root == null)
  // return 0;

  // return Math.max(Math.max(dia(root.left), dia(root.right)), height(root.left)
  // + height(root.right) + 1);
  // }

  // public static int height(Node root) {

  // if (root == null)
  // return 0;

  // int leftH = height(root.left);
  // int rightH = height(root.right);

  // return Math.max(leftH, rightH) + 1;
  // }

  // public static int countData(Node root) {
  // if (root == null)
  // return 0;

  // int leftSum = countData(root.left);
  // int rightSum = countData(root.right);

  // return leftSum + rightSum + root.data;
  // }

}
