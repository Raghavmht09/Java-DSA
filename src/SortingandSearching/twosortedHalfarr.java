package SortingandSearching;
import java.util.*;
public class twosortedHalfarr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      while(t-->0){
	        int n = sc.nextInt();
	        int arr[]= new int[n];
	        for(int i=0;i<n;i++){
	          arr[i]=sc.nextInt();
	        }
	        SortArray(arr,n);
        for(int i=0;i<n;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
	}

}

	private static void SortArray(int[] arr, int n) {
	int i=0,j=n/2;
	while(j<n-1) {
	if(i==j) j++;
	
	if(j<n-1 && arr[i]>arr[j]) {
		  int temp = arr[i];
		    arr[i] = arr[j];
		    arr[j]=temp;
		
	}
	i++;
	}
	
	}

}
