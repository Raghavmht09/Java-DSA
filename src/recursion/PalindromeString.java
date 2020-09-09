package recursion;
import java.util.*;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String str= sc.next();
			substring(str,"");
		}
	}

	private static void substring(String str, String res) {
		// TODO Auto-generated method stub
		if(str.length()==0) {
			System.out.println(res);
			return;
		}
		String w="";
		for(int i=0;i<str.length();i++) {
			w+=str.charAt(i);
			
			if(isPal(w)) {
				substring(str.substring(i+1), res+w+" ");
			}
		}
		
	}

	private static boolean isPal(String w) {
		// TODO Auto-generated method stub
		for(int i=0;i<w.length();i++)
			if(w.charAt(i)!=w.charAt(w.length()-1-i))
				return false;
		return true;
	}

}
