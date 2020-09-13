package recursion;
import java.util.*;
public class TargetSumSubset {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int [n];
		for(int i =0; i<n;i++)
			arr[i]=sc.nextInt();
		
		int tar= sc.nextInt();
		printSubsets(arr,0,"",0,tar);

	}

	private static void printSubsets(int[] arr, int i, String set, int sum, int tar) {
		if(i==arr.length) {
			if(sum==tar) {
				System.out.println(set+".");
			}
			return;
		}

		 
		printSubsets(arr, i+1, set+arr[i]+" ", sum+arr[i], tar);
		printSubsets(arr, i+1, set, sum, tar);
		
	}

}
