package recursion;
import java.util.*;
public class NumPattern {
	 static void printnum(int num) {
			// TODO Auto-generated method stub
			System.out.print(num+" ");
			if(num<=0) {
				return;
			}
			printnum(num-5);
			System.out.print(num+" ");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       int t= sc.nextInt();
       while(t-->0) {
    	   int n= sc.nextInt();
    	  printnum(n);
    	  
       }
	

	
	 }

}
