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
public class BreadthFirstSearchGraph {

    public static void main(String args[]) {
        Graph graph = new Graph(7);
//        graph.addEdge(0, 1);
//        graph.addEdge(0, 2);
//        graph.addEdge(1, 2);
//        graph.addEdge(2, 0);
//        graph.addEdge(2, 3);
//        graph.addEdge(3, 3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 1);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 1);
        graph.addEdge(3, 5);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 3);
        graph.addEdge(5, 4);
        graph.addEdge(5, 6);
        graph.addEdge(6, 4);
        graph.addEdge(6, 5);

        System.out.println("Following is Breadth First Traversal "
                + "(Starting from vertex 2)");
        graph.BFS(2);

                  
        
        
//        ArrayList<String> list = new ArrayList<String>();
//        list.add("A");
//        list.add("B");
//        list.add("C");
//        list.add("D");
//        list.add("E");
//        list.add("F");
//        
//        Iterator iterate = list.iterator();
//        System.out.println("List is: ");
//        
//        while(iterate.hasNext()){
//            System.out.print(iterate.next() + " ");
//        }
//        System.out.println("");
//        
    }
}
