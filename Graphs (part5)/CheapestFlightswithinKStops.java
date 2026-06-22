/*
Cheapest Flights within K Stops
There are n cities connected by some number of flights. You are given an array flights where
flights[i] = [from, to, pricel indicates that there is a flight.
You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.
If there is no such route, return -1.
all values are positive

flights = [ [0,1,100], [1,2,100], [0,2,500] ]
src = 0, dst = 2, k=1

ans = 200


*/
import java.util.*;
public class CheapestFlightswithinKStops {
   static class edge{
    int src;
    int dest;
    int wt;
    public edge(int s,int d,int w){
      this.src = s;
      this.dest = d;
      this.wt = w;
    }
   }

   static class info{
    int v;
    int cost;
    int stops;
    
    public info(int v,int c,int s){
      this.v = v;
      this.cost = c;
      this.stops = s;
    }
   }

   public static void creategraph(int flight[][],ArrayList<edge> graph[]){
    for(int i=0;i<graph.length;i++){
        graph[i] =  new ArrayList<>();
    }

    for(int j=0;j<flight.length;j++){
        int src = flight[j][0];
        int dest = flight[j][1];
        int wt = flight[j][2];

        edge e = new edge(src, dest, wt);
        graph[src].add(e);
    }
   }

   public static int cheapestflt(int n,int flights[][] ,int src,int dest, int k){
     ArrayList<edge> graph[] = new ArrayList[n];
     creategraph(flights, graph);

     int dist[] = new int[n];
     for(int i=0;i<n;i++){
          if(i != src){
            dist[i] = Integer.MAX_VALUE;
          }
     }

    Queue<info> q = new LinkedList<>();
    q.add(new info(src, 0, 0));

    while(!q.isEmpty()){
      info curr = q.remove();
      if(curr.stops>k){
        break;
      }

      for(int i=0; i<graph[curr.v].size(); i++) {
        edge e = graph[curr.v].get(i);
        int u = e.src;
        int v = e.dest;
        int wt = e.wt;

        if(curr.cost+wt < dist[v] && curr.stops <= k) {
                dist [v] = dist [u]+wt;
                q.add(new info(v, dist[v], curr.stops+1));
        }

     }
}
if(dist[dest] == Integer.MAX_VALUE) {
   return -1;
} else {
   return dist [dest];
}
}
    public static void main(String args[]) {
      int n = 4;
      int flights [][] = {{0,1,100},{1,2,100}, {2,0,100},{1,3,600}, {2,3,200}};
      int src = 0, dst = 3, k = 1;
     System.out.println(cheapestflt(n, flights, src, dst, k));
     
   }
}

