package SortingandSearching;
import java.util.*;
public class TwoPointer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int k=sc.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int start=0;
		int end=0;
		int count=0;
		while(end<n) {
		
			if((arr[end]-arr[start])==k) {
				count++;
				start++;
				end++;
			} 
			
			else if((arr[end]-arr[start])<k) end++;
			else start++;
		}
   System.out.println(count);
	}

}
