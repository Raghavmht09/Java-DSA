package SortingandSearching;
import java.util.*;
public class Booksonshelf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		
			int n = sc.nextInt();
			int k = sc.nextInt();
			int arr[]= new int [n];
			
			for(int i =0; i<n;i++) {
				arr[i]=sc.nextInt();
			}
			
			int count=0;
			for(int i =0;i<n;i++) {
				if(arr[i]<=k) count++;
				else break;
			}
				for(int j=n-1;j>=0;j--) {
					if(arr[j]<=k) count++;
					else break;
				}
				if(count>n) System.out.println(0);
				else System.out.println(n-count);
		}
	

}
