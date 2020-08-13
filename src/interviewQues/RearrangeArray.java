import java.util.*;
public class RearrangeArray {
 void rearrange(int arr[], int n) {
	for (int i=0;i<n;i++) {
		arr[i]+= (arr[arr[i]]% n)*n;
	}
	for(int i=0;i<n;i++) {
		arr[i]/=n;
	}
	
}
void print(int[] arr,int n) {
	for (int i=0;i<n;i++) {
		System.out.print(arr[i]+"");
		System.out.println();
	}}
	

	public static void main(String[] args) {
RearrangeArray re= new RearrangeArray();
int arr[]= {3,2,0,1};
int n= arr.length;
System.out.println("orignal array" + "->"+" " );
re.print(arr,n);
re.rearrange(arr, n);
System.out.println("new array"+"->"+" ");
re.print(arr, n);
	}

}
