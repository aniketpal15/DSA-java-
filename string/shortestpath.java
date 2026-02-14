//Given a route containing 4 directions (E, W, N, S), find the shortest path to reach destination.
//   "WNEENESENNN" and onetime written means one unit to x axix or y axix ........



import java.util.*;
public class shortestpath {
    public static void path(String path){
       int x=0;
       int y=0;
       for(int i=0;i<path.length();i++){
        if(path.charAt(i)=='E'||path.charAt(i)=='e'){
            x++;
        }
         else if(path.charAt(i)=='W'||path.charAt(i)=='w'){
            x--;
        }
         else if(path.charAt(i)=='N'||path.charAt(i)=='n'){
            y++;
        }
         else if(path.charAt(i)=='S'||path.charAt(i)=='s'){
           y--;
        }
        else{
            System.out.println("Wrong input is given u have to give between E,W,N,S");
        }
       }
       System.out.print("The sortest distance is "+ Math.sqrt((x*x)+(y*y)));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        path(sc.next());
        sc.close();
    }

}
