package Stacks;
import java.util.*;
public class Directorypath {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.next();
		int n = str.length();
		String res="";
		Stack<String> st = new Stack();
		res+="/";
		for(int i=0;i<n;i++) {
			String dir="";
			while(i<n){
				if(str.charAt(i)=='/') {
					i++;
				}
				else {
					dir+=str.charAt(i);
					i++;
				}
			}
			
			if(dir.equals(".")==true) {
				continue;
			}
			else if (dir.equals("..")==true) {
				if (!st.empty())  
                    st.pop();     
			}
			else if(dir.length()!=0) {
				st.push(dir);
			}
		}
		
		Stack <String> rev= new Stack();
		while(st.size()>0) {
			rev.push(st.pop());
		}
		while(rev.size()>0) {
			if(rev.size()!=1) {
				res+=(rev.pop()+"/");
			}else {
				res+=rev.pop();
			}
		}
		System.out.println(res);
	}

}
