/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.BFS;

/**
 *
 * @author root
 */
public class BreadthFirstSearchTree {
    public static void main(String args[])
    {
        BinaryTree tree_level = new BinaryTree();
        tree_level.root = new Node(2);
        tree_level.root.left = new Node(4);
        tree_level.root.right = new Node(5);
        tree_level.root.left.left = new Node(7);
        tree_level.root.right.left = new Node(9);
        
        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
        System.out.println("");
    }
}
