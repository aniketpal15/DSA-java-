//  Trapping Rain Water.............
/*
Given n non-negative integers representing an elevation
map where the width of each bar is 1, compute how much
water it can trap after raining.
 
height =[4,2,0,6,3,2,5]
*/

public class TrappingRainwater {
    public static void trappedwater(int arr[],int width){
        int trapwat =0;
        int leftmax[] = new int[arr.length];
        int rightmax[] = new int[arr.length];
        leftmax[0]=arr[0];
        rightmax[arr.length-1]=arr[arr.length-1];
        for(int i =1;i<arr.length;i++){
            leftmax[i]=leftmax[i-1]>arr[i]?leftmax[i-1]:arr[i];
            rightmax[arr.length-i-1]=rightmax[arr.length-i]>arr[arr.length-i-1]?rightmax[arr.length-i]:arr[arr.length-i-1];
        }
        for(int j =0;j<arr.length;j++){
            trapwat += (Math.min(leftmax[j],rightmax[j])-arr[j])*width;
        }
        System.out.print("The total trapped water is "+trapwat);
    }

    public static void main(String args[]){
        int height[]={4,2,0,6,3,2,5};
        trappedwater(height,1);
       
    }
}
