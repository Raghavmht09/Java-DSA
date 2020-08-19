package interviewQues;
import java.util.*;

public class TrainPlatform {
static int minplatform(int arr[],int dep[],int n) {
	Arrays.sort(arr);
	Arrays.sort(dep);
	int plat=1;
	int i=1;
	int j=0;
	int res=1;
	while(i<n &&j<n) {
		if(arr[i]<=dep[j]) 
			{
			plat++; i++;
			}
		else if(arr[i]>dep[j]) {
			plat--;
			j++;
		}
		if(res<plat) {
			res+=plat;
		}
		
	}
	return res;
}

	public static void main(String[] args) {
		 int arr[] = { 910, 940, 950, 1100, 1200, 1800 }; 
	        int dep[] = { 910, 940, 945, 1000, 1100, 1830 }; 
	        int n = arr.length; 
	        System.out.println("Minimum Number of Platforms Required = "
	                           + minplatform(arr, dep, n)); 

	}

}
