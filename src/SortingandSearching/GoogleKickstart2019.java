package SortingandSearching;
import java.util.*;
public class GoogleKickstart2019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p= sc.nextInt();
		int arr[]= new int [n];
		
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int [] prefix= new int[n+1];
		
		for(int j =0;j<n;j++) {
			prefix[j+1]=prefix[j]+arr[j];
		}
		long result=Long.MAX_VALUE;
		for(int j=p-1;j<n;j++) {
			long currentsum = prefix[j]-prefix[j-(p-1)];
			long totalhours=arr[j]*(p-1)-currentsum;
			result=Math.min(totalhours, result);
		}
			System.out.println(result);
			

	}

}
