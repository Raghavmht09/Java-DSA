package recursion;
import java.util.*;
public class Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     int t= sc.nextInt();
     while(t-->0) {
    	 int n= sc.nextInt();
    	 int p=2;
    	 String str = "1 ";
    	 solve(n,p,str);
     }
	}

	private static void solve(int n, int p, String str) {
		// TODO Auto-generated method stub
		if(n==1) System.out.println(str);
		for(int i=p;i<=n;i++) {
			if(n%i==0) {
				char a = (char)i;
				solve(n/p,i,str+a);
			}
		}
		
		
	}

}
