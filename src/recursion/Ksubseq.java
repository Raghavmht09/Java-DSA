package recursion;
import java.util.*;
public class Ksubseq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				
			
					int n = sc.nextInt();
					int a[] = new int[n];
					for(int i=0;i<n;i++) {
						a[i]= sc.nextInt();
						
					}
					int k = sc.nextInt();
					recur(a,"",0,n,k);
				
	}

static void recur(int[] a, String out, int i, int n, int k) {
		// TODO Auto-generated method stub
	if(k==0) System.out.println(out);
	
	for(int j=i;j<n;j++) {
		recur(a, out+(a[j])+" ", j+1, n, k-1);
	}
	
		
	}

}
