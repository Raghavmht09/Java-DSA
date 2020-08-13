import java.util.*;
public class CircularArrsum {

	static int kadane(int a[]) {
		int n=a.length;
		int max=Integer.MIN_VALUE;
		int currmax=0;
		int i;
		for(i=0;i<n;i++) {
			currmax=currmax+a[i];
			if(currmax<0) currmax=0;
			if(currmax>max) {
				max=currmax;
			}
			
	}
		return max;
	}
	static int maxCircularsum(int a[]) {
		int n=a.length;
		int maxkadane=kadane(a);
		int maxwrap=0;
		for(int i=0;i<n;i++) {
			maxwrap+=a[i];
			a[i]=-a[i];
			
		}
		maxwrap+=kadane(a);
		return (maxwrap>maxkadane?maxwrap:maxkadane);
		
	}
	public static void main(String[] args) {
		int a[] = { 11, 10, -20, 5, -3, -5, 8, -13, 10 }; 
        System.out.println("Maximum circular sum is " + maxCircularsum(a)); 
		
	
		}
	

	

}
