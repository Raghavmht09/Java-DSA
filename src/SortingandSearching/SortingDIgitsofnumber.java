package SortingandSearching;
import java.util.*;
public class SortingDIgitsofnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n =sc.nextInt();
			int i,num=n,count=0;
			while(num!=0) {
				count++;
				num=num/10;
			}
			int arr[]= new int[count];
			for (i =0;i<count;i++) {
				arr[i]=n%10;
			n=n/10;
			}
			Arrays.sort(arr);
			int flag=0;
			for(i=0;i<count-1;i++) {
				if(arr[i+1]-arr[i]!=1) {
					flag=1;
					break;
				}
			}
			if(flag==0) System.out.println("YES");
			else System.out.println("NO");
		}

	}

}
