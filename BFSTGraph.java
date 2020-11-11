import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Iterator;

class BFSTGraph{
    int V;
    LinkedList<Integer> adj[];
    //AdjacencyList formed;
    BFSTGraph(int v){
        V = v;
        adj = new LinkedList[V];
        for(int i =0; i<V; i++){
            adj = new LinkedList(i);//Here i have not understand why they use like this;
        }
    }
 
        public void add(int u,int v){
           
          
            adj[u].add(v);
        
        }
        public void BFS(int i){
            boolean visited[] = new boolean[V];
            LinkedList<Integer> queue = new LinkedList<>();
            visited[i] = true;
            queue.add(i);
            while(queue.size() != 0){
                int u = queue.poll();
                System.out.println(u);//only here i print the graph vertex;
            }
            Iterator<Integer> i = adj[i].listIterator();
            while(i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        public static void main(String [] args){
            int V = 5;
            ArrayList<ArrayList<Integer> > bfs = new ArrayList<ArrayList<Integer> >(V);
            BFSTGraph g = new BFSTGraph(V);
            g.add(2,0);
            g.add(1,0);
            g.add(5,2);
            g.add(1,2);
            
            g.BFS(4);

        }
}