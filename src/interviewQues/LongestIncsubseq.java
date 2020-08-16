import java.util.*;
public class LongestIncsubseq {
public static int lis(int arr[],int n) {
	int [] dp= new int[n];
	int i , j , max=0;
	for (i=0;i<n;i++) {
		dp[i]=1;
		for (j=0;j<i;j++) {
			if(arr[i]>arr[j] && dp[i]<dp[j]+1)
				dp[i]=dp[j]+1;
		}
		
	}
	for (i=0;i<n;i++) {
		if (max<dp[i]) max=dp[i];
		
	}
	return max;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
         int n = arr.length; 
         System.out.println("Length of lis is " 
                           +lis( arr, n ) + "\n" ); 

	}

}
