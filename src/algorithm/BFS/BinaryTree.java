/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.BFS;

import java.util.LinkedList;
import java.util.Queue;


/**
 *
 * @author root
 */
public class BinaryTree {
    Node root;
    void printLevelOrder()
    {
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");
            
            /*Enqueue left child*/
            if(tempNode.left != null)
            {
                queue.add(tempNode.left);
            }
            
            /*Enqueue right child*/
            if(tempNode.right != null)
            {
                queue.add(tempNode.right);
            }
        }
    }

   
    
}
