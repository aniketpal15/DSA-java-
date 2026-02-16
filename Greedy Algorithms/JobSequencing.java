/*
Job Sequencing Problem............

Given an array of jobs where every job has a deadline and profit if the job is finished
before the deadline. It is also given that every job takes a single unit of time, so the
minimum possible deadline for any job is 1. Maximize the total profit if only one job can
be scheduled at a time.

Job A = 4, 20
Job B = 1, 10
Job C = 1, 40
Job D = 1, 30

ans = C, A
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {
    public static ArrayList<Integer> jobget(int jobinfo[][]){
        int main[][] = new int[jobinfo.length][3];
        for(int i=0;i<jobinfo.length;i++){
            main[i][0]=i;
            main[i][1] = jobinfo[i][0];
            main[i][2] = jobinfo[i][1];
        }
        Arrays.sort(main,Comparator.comparingDouble(o ->o[2]));
        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;   
        for(int j=jobinfo.length-1;j>=0;j--){
            int curr = main[j][1];
            if(curr>time){
                time++;
                seq.add(main[j][0]);
            }
        } 

        seq.add(seq.size());
        return seq;
    }
    public static void main(String fargs []){
     int jobsinfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
     System.out.println("max work = "+jobget(jobsinfo).get(jobget(jobsinfo).size()-1));
     for(int i=0;i<jobget(jobsinfo).size()-1;i++){
       System.out.print(jobget(jobsinfo).get(i)+" ");
     }
    }
}
