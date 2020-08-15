import java.util.*;
public class Equilsuminarr {
int eqsum(int arr[],int n) {
	int i,j;
	int leftsum=0;
	int sum=0;
	for(i=0;i<n;i++) {
		sum+=arr[i];//totalsum
	}
	for(i=0;i<n;i++) {
		sum-=arr[i];//rightsum
		if(leftsum==sum) return i;
		leftsum+=arr[i];
	}
	return 0;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Equilsuminarr eq= new  Equilsuminarr();
		 int arr[] = { -7, 1, 5, 2, -4, 3, 0 }; 
		 int n=arr.length;
		 System.out.println("First Equilibirium index is "+ eq.eqsum(arr, n));
	}

}
