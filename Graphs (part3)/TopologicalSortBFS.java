/*
Topological Sort using BFS (Kahn's Algorithm)...............
*/
import java.util.*;
public class TopologicalSortBFS {
     static class edge {
        int src;
        int dest;
       

        public edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public static ArrayList<Integer> bsf( ArrayList<edge>graph[]){
        Queue<Integer> q = new LinkedList<>();
        boolean vist[] = new boolean[graph.length];
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(0);
        while(!q.isEmpty()){
           int curr = q.remove();
           if(!vist[curr]){
            ans.add(curr);
            vist[curr] = true;
            for(int i=0;i<graph[curr].size();i++){
                  edge e = graph[curr].get(i);
                  q.add(e.dest);
            }
           }
        }

        return ans;

    }

    public static void calcindeg(ArrayList<edge> graph[],int indeg[]){
        for(int i=0;i<graph.length;i++){
            int v=i;
            for(int j=0;j<graph[v].size();j++){
                edge g = graph[v].get(j);
                indeg[g.dest]++;
            }
        }
    }

    public static void topsort(ArrayList<edge>graph[]){
        int indeg[] = new int[graph.length];
        calcindeg(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i] ==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();
            System.out.print(curr+" ");


            for(int j=0;j<graph[curr].size();j++){
                edge e = graph[curr].get(j);
                indeg[e.dest]--;
                if(indeg[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }

        System.out.println();
    }

public static void main(String args[]) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
    
graph[2].add(new edge(2, 3));

graph[3].add(new edge(3, 1));

graph [4].add(new edge(4, 0));
graph [4].add(new edge(4, 1));

graph[5].add(new edge(5, 0));
graph[5].add(new edge(5, 2));

topsort(graph);

 }
}
