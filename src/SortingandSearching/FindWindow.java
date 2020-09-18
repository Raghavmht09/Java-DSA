package SortingandSearching;
import java.util.*;

public class FindWindow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int i, start,end;
			int arr[]= new int[n];
			for(i=0;i<n;i++)
				arr[i]=sc.nextInt();
			
			for(start=0;start<n-1;start++)
				if(arr[start+1]<arr[start]) break;
			
			for(end=n-1;end>0;end--)
				if(arr[end-1]>arr[end]) break;
			
			int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
			
			for(i=start;i<=end;i++) {
				if(max<arr[i]) max=arr[i];
			
			if(min>arr[i]) min=arr[i];
			}
			for(i=0;i<start;i++) {
				if(arr[i]>min) start=i;
			}
			for(i=end;i<n;i++) {
				if(arr[i]<max) end =i;
			}
			System.out.println(start+" "+end);
		}

	}

}
