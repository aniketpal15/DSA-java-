/*
Activity Selection............
You are given n activities with their start and end times. Select the maximum number of activities
that can be performed by a single person, assuming that a person can only work on a single
activity at a time. Activities are sorted according to end time.

start = [10, 12, 20]
end = [20, 25, 30]

ans = 2 (AO & A2)

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void select(int start[], int end[]) {
        
        int act[][]= new int[start.length][3];
        for(int j=0;j<start.length;j++){
            act[j][0]=j;
            act[j][1]= start[j];
            act[j][2]= end[j];
        }
        Arrays.sort(act,Comparator.comparingDouble(o ->o[2]));
        
        int max;
        ArrayList<Integer> ans = new ArrayList<>();
        max=1;
        int last = act[0][2];
        ans.add(act[0][0]);
        for(int j=1;j<start.length;j++){
              if(last<=act[j][2]){
                max++;
                ans.add(act[j][0]);
                last = act[j][2];
              }
        }

        System.out.println("Max activity = "+ max);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
    public static void main(String args[]){
        int start[] = {10, 12, 20};
         int end[] = {20, 25, 30};
         select(start, end);
    }
}
