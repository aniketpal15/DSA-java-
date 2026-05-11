import java.util.*;
public class BSF {
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

System.out.println(bsf(graph));
 }
}
