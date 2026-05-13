/*
Bipartite Graph

A Bipartite Graph is a graph whose vertices can be divided into two independent sets, U and V such that every edge
(u, v) either connects a vertex from U to V or a vertex from V to U. In other words, for every edge (u, v), either u
belongs to U and v to V, or u belongs to V and v to U. We can also say that there is no edge that connects vertices of
same set.

*/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartitegraph {
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

public static boolean bipart(ArrayList<edge>graph[]){
       int col[] = new int[graph.length];
       for(int i=0;i<col.length;i++){
        col[i] = -1;
       }

       Queue<Integer> q = new LinkedList<>();

       for(int i=0;i<graph.length;i++){
           if(col[i]==-1){
              q.add(i);
              col[i]=0;
              while(!q.isEmpty()){
                int curr = q.remove();
                for(int j=0;j<graph[curr].size();j++){
                    edge e = graph[curr].get(j);
                    if(col[e.dest]==-1){
                        int nextcol = col[curr]==0?1:0;
                        col[e.dest ] = nextcol;
                        q.add(e.dest);
                    }else if(col[e.dest] == col[curr]){
                        return false;
                    }
                }
              }
           }
       }
       return true;
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
//graph[3]. add(new edge(3, 4, 1));
graph[3].add(new edge(3, 5, 1));

graph[4].add (new edge(4, 2, 1));
//graph [4]. add (new edge(4, 3, 1));
graph[4].add(new edge(4, 5, 1));

graph[5]. add(new edge(5, 3, 1));
graph [5].add(new edge(5, 4, 1));
graph[5].add(new edge(5, 6, 1));

graph[6].add(new edge(6, 5, 1));


System.out.println(bipart(graph));

 }
}
