package interviewQues;
import java.util.*;
public class MajorityeleminArr {
// ANY ELEMENT IN ARRAY IS MAJORITY ELEMENT IF IT OCCURS FOR MORE THAN N/2 TIMES IN ARRAY
	
	static void majusingmap(int arr[], int n) {
		n=arr.length;
		HashMap<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<n;i++) {
			if(map.containsKey(arr[i])){
				int count= map.get(arr[i])+1;
				if(count>n/2) {
					System.out.println("Element found "+ arr[i]);
					return;
				}
				else {
					map.put(arr[i], count);
				}
			}else {
				map.put(arr[i], 1);
			}
  
		}
		 System.out.println("No element of Majority in Array");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = new int[]{2,2,2,2,5,5,2,3,3}; 
		int  n=a.length;
		 majusingmap(a, n);
	}

}
