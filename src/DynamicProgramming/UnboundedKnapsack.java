package DynamicProgramming;
import java.util.*;
public class UnboundedKnapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] vals= new int[n];
		
		int [] wts= new int[n];
		for(int i=0; i<vals.length;i++ ) {
			vals[i]= sc.nextInt();
		}
		
		for(int i=0; i<wts.length;i++ ) {
			wts[i]= sc.nextInt();
		}
		
		int cap= sc.nextInt();
		int[ ]  dp= new int[cap+1];
		dp[0]=0;
		for(int bagc=1;bagc<=
				cap;bagc++) {
			int max=0;
			for(int i =0;i<n;i++) {
				int rbagc= bagc-wts[i-1];
				int rbagv=dp[rbagc];
				int totalbagv= rbagv+ vals[i];
				
				if(totalbagv>max) {
					max=totalbagv;
				}
			}
			dp[bagc]=max;
		}
	System.out.println(dp[cap]);
	}

}
