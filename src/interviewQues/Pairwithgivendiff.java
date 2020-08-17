package interviewQues;
import java.io.*;

public class Pairwithgivendiff {
static boolean pair(int arr[],int n) {
	int i=0,j=1;
	int size=arr.length;
	while(i<size&&j<size) {
		if(i!=j && arr[j]-arr[i]==n) {
			System.out.println("Pair Found :"+"("+arr[i]+","+arr[j]+")");
			return true;
		}
		else if (arr[j]-arr[i]<n)
			j++;
		else i++;

		
	}
	System.out.println("No Pair exists");
	return false;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {1, 8, 30, 40, 100}; 
	        int n = 60; 
	        Pairwithgivendiff p = new Pairwithgivendiff();
	        p.pair(arr,n);
	        
	}

}
