package recursion;

import java.util.*;
import java.io.*;
public class Sumofsubsetsofarr {
  public static void main(String args[]) throws IOException {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
    int n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
    subset(arr,0,0,n,1);
    }
  }
 static long sum=0;
  static void subset(int a[],long cursum,int i , int n,int x){
   if(x==1){
     sum+=cursum;
    
   }
   if(i==n) return;
      subset(a,cursum+a[i],i+1,n,1);
    subset(a,cursum,i+1,n,0);
    if(i==0){
      System.out.println(sum);
      sum=0;
    }
 }
}

