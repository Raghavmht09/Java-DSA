package recursion;
import java.util.*;
public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		ArrayList<String> res = gss(str);
		System.out.println(res);

	}
	static ArrayList<String> gss(String str){
	
		if(str.length()==0) {
			ArrayList<String> b = new ArrayList<String>();
			b.add("");
			return b;
		}
	char ch = str.charAt(0);
	String sub = str.substring(1);
	ArrayList<String> rres = gss(sub);
	ArrayList<String> myres = new ArrayList<String>();
	for (String e: rres) {
		myres.add(""+ e);
		myres.add(ch+e);
	}
	return myres;
	
	
	}
}
