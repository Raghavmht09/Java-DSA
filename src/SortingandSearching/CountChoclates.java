package SortingandSearching;

import java.util.*;
import java.io.*;
public class CountChoclates {
  public static void main(String args[]) throws IOException {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    Arrays.parallelSort(arr);
    int q=sc.nextInt();
   while(q-->0){
        int x=sc.nextInt();
       System.out.println(binarySearch(arr,0,n-1,x));
    }
  }
  public static int  binarySearch(int a[],int l,int h, int x){
int count=0;
while(l<=h){
  int mid = l+(h-l)/2;
  if(a[mid]<=x ){
    count+=mid-l+1;
    l=mid+1;
  }
  else
    h=mid-1;
}
return count;
}
}