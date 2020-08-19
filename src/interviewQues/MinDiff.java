package interviewQues;
import java.util.*;
public class MinDiff {
static int fun(int arr[], int m,int n){
	if(m==0||n==0) return 0;
	Arrays.sort(arr);
	if(n<m) return -1;
	int mindiff=Integer.MAX_VALUE;
	for(int i =0;i+m-1<n;i++) {
		int diff= arr[i+m-1]-arr[i];
		if(diff<mindiff) mindiff=diff;
	}
	return mindiff;
}
	public static void main(String[] args) {
		int arr[] = {12, 4, 7, 9, 2, 23, 
                25, 41, 30, 40, 28, 
                42, 30, 44, 48, 43, 
               50}; 
                 
    int m = 7; 
      
    int n = arr.length; 
    System.out.println("Minimum difference is "
            + fun(arr, m, n)); 

	}

}
