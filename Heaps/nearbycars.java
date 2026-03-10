/*
Nearby Cars

We are given N points in a 2D plane which are locations of N cars.
If we are at the origin, print the nearest K cars.

CO (3, 3)
C1 (5, -1)
C2 (-2, 4)
k=2
ans = CO & C2

*/

import java.util.*;

public class nearbycars {
    public static class points implements Comparable<points>{
        int idx;
        int x;
        int y;
        int dis;
        points(int idx,int x,int y){
            this.idx=idx;
            this.x=x;
            this.y=y;
            this.dis = (x*x + y*y);
        }
        @Override
        public int compareTo(points p2){
            return this.dis-p2.dis;
        }
    }
    public static void main(String args[]){
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k=2;
        
        PriorityQueue<points> pq = new PriorityQueue<>();
        for(int i=0;i<pts.length;i++){
            pq.add(new points(i,pts[i][0],pts[i][1] ));
        }
        for(int i=0;i<k;i++){
            System.out.print("Car"+pq.remove().idx+" ");
        }
    }
}
