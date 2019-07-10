/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithm.BFS;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author root
 */
public class Graph {
    private int V;
    private LinkedList<Integer>adj[];

    public Graph(int v){
        V = v;
        adj = new LinkedList[V];
        for(int i = 0; i<v; i++){
            adj[i] = new LinkedList();
        }
    }
    
    void addEdge(int v, int w){
            adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V];
        
        //create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        //Mark the current node as visited and enqueue it
        visited[s] = true;
        queue.add(s);
        
        while(queue.size() != 0)
        {
            //Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");
            
            //Get all adjacent vertices of the dequeue vertex s
            //If a adjacent has not been visited, then mark it
            //visited and enqueue it
            
            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
            
        }
        
    }
}
