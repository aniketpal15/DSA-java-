/*
Has Path ?

For given src & dest, tell if a path exists from src to dest

src = 0, dest = 5
*/
import java.util.*;
public class HasPath {
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

public static boolean haspath(ArrayList<edge> graph[],int curr,int dest,boolean vist[]){
    if(curr == dest){
        return true;
    }
    vist[curr] =  true;
    for(int i=0;i<graph[curr].size();i++){
        edge e = graph[curr].get(i);
        if(!vist[e.dest] && haspath(graph, e.dest, dest, vist) ){
            return true;
        }
    }
    return false;
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


System.out.println(haspath(graph, 0, 5, new boolean[v]));

 }
}
