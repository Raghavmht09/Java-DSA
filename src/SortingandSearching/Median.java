package SortingandSearching;

import java.util.*;
import java.io.*;
public class Median {
  public static void main(String args[]) throws IOException {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k = sc.nextInt();
    int a[]=new int[n+1];
    	
    for(int i=1;i<=n;i++){
      a[i]=sc.nextInt();
    }
    
    Arrays.sort(a);
    int mid = (n+1)/2;
    int i,move=0,count=1;
    for(i =mid;i<n;i++) {
  	  if(move+(a[i+1]-a[i])*count<=k) {
  		  move+=(
  				  a[i+1]-a[i]) * count;
  		  a[i]=a[i+1];
  		  count++;
  	  }else break;
    }
    if(move<=k) a[i]+=(k-move)/count;
    
  
   System.out.println(a[i]);
 
}
  
}
