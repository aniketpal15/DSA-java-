/*
Topological Sorting
Directed Acyclic Graph(DAG) is a directed graph with no cycles.

Topological sorting is used only for DAGs (not for non-DAGs)

It is a linear order of vertices such that every directed edge u -> v,
the vertex u comes before v in the order.

*/

import java.util.ArrayList;
import java.util.Stack;

public class Topologicalsort {
    static class edge {
        int src;
        int dest;
        int wt;

        public edge(int src, int desc, int wt) {
            this.src = src;
            this.dest = desc;
            this.wt = wt;
        }
    }
public static void topsort(ArrayList<edge> graph[]){
    boolean vist[] = new boolean[graph.length];
    Stack<Integer> s = new Stack<>();
    for(int i=0;i<graph.length;i++){
        if(!vist[i]){
            topsortutil(graph,i,vist,s);
            }
        }
     
   while(!s.isEmpty()){
    System.out.println(s.pop()+" ");
   }
} 

public static void topsortutil(ArrayList<edge> graph[],int curr,boolean vist[],Stack<Integer> s){
    vist[curr] = true;
    for(int i=0;i<graph[curr].size();i++){
        edge e = graph[curr].get(i);
        if(!vist[e.dest]){
            topsortutil(graph, e.dest, vist, s);
        }
        
    }
s.push(curr);
}

public static void main(String args[]) {
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    
graph[0].add(new edge(0, 1, 1));
graph[0].add(new edge(0, 2, 1));

graph[1].add(new edge(1, 0, 1));
graph[1].add(new edge(1, 3, 1));

graph[2].add(new edge(2, 0, 1));
graph[2].add(new edge(2, 4, 10));

graph[3].add(new edge(3, 1, 1));
graph[3]. add(new edge(3, 4, 1));
graph[3].add(new edge(3, 5, 1));

graph[4].add (new edge(4, 2, 1));
graph [4]. add (new edge(4, 3, 1));
graph[4].add(new edge(4, 5, 1));

graph[5]. add(new edge(5, 3, 1));
graph [5].add(new edge(5, 4, 1));
graph[5].add(new edge(5, 6, 1));

graph[5].add(new edge(6, 5, 1));


topsort(graph);

 }
}
