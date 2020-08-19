package interviewQues;
import java.util.*;
public class StoreWater {
static int maxwater(int arr[],int n) {
	int res=0;
	for(int i =1;i<n-1;i++) {
		int left=arr[i];
		
		for(int j=0;j<i;j++) {
			left=Math.max(left,arr[j]);
		}
		int right=arr[i];
		for (int j=i+1;j<n;j++) {
			right=Math.max(right, arr[j]);
		}
				res+=Math.min(left, right)-arr[i];
	}
	return res;
}
	public static void main(String[] args) {
		 int[] arr = {2,0,2,0,0,3,0,1,0,4};
   int n = arr.length;

   System.out.print(maxwater(arr,n));

	}

}
