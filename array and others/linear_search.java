// linear search from an array

import java.util.*;
public class linear_search {
  public static void search(int arr[],int item){
    int m=1;
    for(int i=0;i<arr.length;i++){
       if(arr[i]==item){
        System.out.println("the index of the data "+item+" is "+i);
        m=1;
        break;
       }else{
        m=0;
       }
    }
       if(m==0){
        System.out.println("data not found");
       }

  }
   
  public static void main(String args[]){
    int number[]={2,5,4,7,6,3};
    Scanner sc =new Scanner(System.in);
    search(number,sc.nextInt());
    sc.close();

  }
}