package interviewQues;
import java.util.*;
public class Arrzigzag {
static void zigzag(int arr[]) {
	boolean flag=true;
	int temp=0;
	for (int i=0;i<arr.length-2;i++)
	{
		if(flag) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		else {
			if(arr[i]<arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
		}
		flag=!flag;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4, 3, 7, 8, 6, 2, 1};

zigzag(arr);
System.out.println(Arrays.toString(arr));
	}

}
