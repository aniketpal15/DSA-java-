/*
Min Absolute Difference Pairs

Given two arrays A and B of equal length n. Pair each element of array A to an element
in array B, such that sum S of absolute differences of all the pairs is minimum.

A= [1, 2, 3]
B= [2, 1, 3]
ans = 0
*/

import java.util.*;

public class Absolutedifference {
    public static int absdiff(int a[],int b[]){
        Arrays.sort(a);
        Arrays.sort(b);
        int mindiff=0;
        for(int i=0;i<a.length;i++){
            mindiff += Math.abs(a[i]-b[i]);
        }
        return mindiff;
    }
    public static void main(String args[]){
        int a[]={1, 2, 3};
        int b[] = {2, 1, 3};
        System.out.println(absdiff(a, b));
    }
}
