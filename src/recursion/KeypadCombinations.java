package recursion;
import java.util.*;
public class KeypadCombinations {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		ArrayList<String> res = getKPC(str);
		for(String s:res) {
		System.out.println(s);
	}}
	static String[] codes = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	private static ArrayList<String> getKPC(String str) {
		
		if(str.length()==0) {
			ArrayList<String> bres = new ArrayList();
			bres.add("");
			return bres;
		}
		char ch = str.charAt(0);
		String ros = str.substring(1);
		ArrayList<String> rres=getKPC(ros);
		ArrayList<String> myres = new ArrayList();
		String codeforch=codes[ch-48];
		for(int i=0;i<codeforch.length();i++) {
			char chcode = codeforch.charAt(i);
			for(String rstr:rres) {
				myres.add(chcode+rstr);
			}
		}
		return myres;
	}

}
