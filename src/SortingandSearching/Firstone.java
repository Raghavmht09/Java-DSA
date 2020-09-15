package SortingandSearching;
import java.util.*;
public class Firstone {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int  n =sc.nextInt();
			int arr []= new int [n];
			for(int i=0;i<arr.length;i++)
				arr[i]=sc.nextInt();
			
			System.out.println(Find(arr,0,n-1));
		}

	}

	private static int Find(int[] arr, int start, int end) {
		if(start>end) return -1;
		
		int mid = start+ (end-start)/2;
		if(arr[mid]==1 && (mid==0||arr[mid-1]==0)) {
			return mid;
		}
		else if (arr[mid]==0) {
			return Find(arr, mid+1, end);
			
			
			
		}else {
			return Find(arr, start, mid-1);
		}
	}

}
