package interviewQues;
import java.util.*;
public class SlidingWindowMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Solution sol = new Solution();
 
	}
static class Solution{
	public int [] slidingwindowmax(int[] a , int k) {
		int n= a.length;
		Deque<Integer> dq= new LinkedList<>();
		int[] ans= new int[n-k+1];
		
		int i=0;
	
		for(;i<k;i++) {
			while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
				dq.removeLast();
			}
			dq.addLast(i);
		}
		
		for(;i<n;i++) {
			ans[i-k]=dq.peekFirst();
			
			while(!dq.isEmpty() && dq.peekFirst()<= i-k) {
				dq.pollFirst();
			}
			
			for(;i<k;i++) {
				while(!dq.isEmpty() && a[dq.peekLast()]<=a[i]) {
					dq.removeLast();
				}
				dq.addLast(i);
				ans[i-k]=dq.peekFirst();
		}
		
		
		
		
		return ans;
	}
}
}
