package recursion;
import java.util.*;
public class PermutationsofString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		PrintPermutaions(str,"");

	}

	private static void PrintPermutaions(String ques, String ans) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			char ch = ques.charAt(i);
			String left = ques.substring(0,i);
			String right = ques.substring(i+1);
			String roq =  left+right;
			PrintPermutaions(roq, ans+ch);
		}
		
	}

}
