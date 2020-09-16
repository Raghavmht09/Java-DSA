package SortingandSearching;
import java.util.*;
import java.io.*;
public class MissingInAP {
   
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	      int t= sc.nextInt();
	      while(t-->0) {
	    	  int n = sc.nextInt();
	    	  int arr[] = new int[n];
	    	  for(int i=0;i<n;i++) {
	    		  arr[i]=sc.nextInt();
	    	  }
	    	  System.out.println(findMissing(arr,0,n-1));
	    	  
	      }
	}

	private static int findMissing(int[] arr, int lo, int hi) {
	
		int mid= (lo+hi)/2;
		int n = arr.length;
		 int diff = (arr[n - 1] - arr[0]) / n; 
		 if(lo>=hi) return -1;
		 
		 if (arr[mid + 1] - arr[mid] != diff) 
		        return (arr[mid] + diff); 
		  
		    if (mid > 0 && arr[mid] - arr[mid - 1] != diff) 
		               
		        return (arr[mid - 1] + diff); 
		  
		   
		    if (arr[mid] == arr[0] + mid * diff) 
		        return findMissing(arr, mid + 1,  
		                               hi); 
		  

		    else   return findMissing(arr, lo, mid - 1); 
	}

}
