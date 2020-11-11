import java.util.*;
import java.lang.*;
class DFSGraph{
    int V;
    DFSGraph(int i){
        this.size = size;
        boolean visited[];
    }
    public void DFSTreverse(int V, boolean visited []){
        visited [V] = true;
        System.out.println(V);

        }
        Iterator i = new ListIterator();
        







    }
    public void DFS(int V){
       
        boolean visited = new visited[V];
        DFSTreverse(V,visited);


    }
    public static void main(String [] args){
        Graph g = new Graph();
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,0);
        g.addEdge(2,0);
        g.DFS(2);

    }

}