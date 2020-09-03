package interviewQues;
import java.util.*;

public class Idxmultiele {
	public static int findpivot(int arr[], int n) {
	
		for(int i=0;i<n;i++) {
		if(arr[i]>arr[i+1%n]) {
			return i;
		}
		
	}
	return 0;
}
	
	public static int maxsum(int arr[], int n) {
		int pivot=findpivot(arr, n);
		int diff= n-1-pivot;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=((i+diff)%n)*arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[] = {3,2,1};  
	    int n = arr.length; 
	    int max = maxsum(arr,n);  
	    System.out.println(max); 
	}

}
