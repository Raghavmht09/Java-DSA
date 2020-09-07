package recursion;
import java.util.*;
public class PrintBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			while(t-->0) {
				int n = sc.nextInt();
				int a[] = new int[n];
				a[0]=0;
				printBinary(n,1,a);
				a[0]=1;
				printBinary(n, 1, a);
			}
	}

	private static void printBinary(int n, int k, int[] a) {
		// TODO Auto-generated method stub
		if(k==n) {
			for(int i=0;i<n;i++) {
				System.out.print(a[i]);
			}
			System.out.println();
			return;
		}
		if(a[k-1]==0) {
			a[k]=0;
			printBinary(n, k+1, a);
			a[k]=1;
			printBinary(n, k+1, a);
		}
		else {
			a[k]=0;
			printBinary(n, k+1, a);
		}
	}

}
