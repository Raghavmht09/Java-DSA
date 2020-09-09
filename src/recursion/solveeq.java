package recursion;
import java.util.*;
public class solveeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int z = sc.nextInt();
			System.out.println(solve(n,z));
		}
		
	}

	private static int solve(int n, int z) {
		// TODO Auto-generated method stub
		if(n==1) {
			if(z>=0) {
				return 1;
			}else {
				return 0;
			}
		}
		if(z<0) return 0;
		int total=0;
		for(int i =0;i<=z;i++) {
			
			total+=solve(n-1, z-i);
					
			}
		return total;
		}
	

}
