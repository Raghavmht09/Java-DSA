package SortingandSearching;
import java.util.*;
public class MaxDivisorsinrange {

	 static int gcd(int a, int b) 
	    { 
	     while(a!=0 && b!=0){
	          if(b%a==0)
	              return a;
	          int temp = a;
	          a = b%a;
	          b = temp;
	      }
	      return a;
	    } 
	 static int lowerbound(int a[], int lo, int hi,int key) {
		 if(lo>hi) return hi;
		 int mid = (lo+hi)/2;
		 if(a[mid]==key) return mid;
		 else if (a[mid]>key) return lowerbound(a, lo, mid-1, key);
		 else return lowerbound(a, mid+1, hi, key);
	 }
	 static int upperbound(int a[], int lo, int hi,int key) {
		 if(hi<lo) return lo;
		 int mid = (lo+hi)/2;
		 if(a[mid]==key) return upperbound(a, mid+1, hi, key);
		 else if (a[mid]>key) return upperbound(a, lo, mid-1, key);
		 else return upperbound(a, mid+1, hi, key);
	 }
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int div[] = new int[9999999];
	int g = (a<b)?gcd(a,b):gcd(b,a);
	int count=0;
	for(int i=1;i<=g;i++) {
		if(g%i==0)
		div[count++]=i;
	}
	
	int q= sc.nextInt();
	while(q-->0) {
		int low =sc.nextInt();
		int high= sc.nextInt();
		 int id1 = lowerbound(div,0,count-1, low);
	      int id2 = upperbound(div,0,count-1, high);
	      if(count==0 || low>div[id1])
	        id1++;
	      int diff = id2 - id1;
	      if(diff == 0) {
	    	  int res=-1;
	        System.out.println(res);
	      }
	      else {
	        System.out.println(div[id2-1]);
	        }
		
	}

	}

}
