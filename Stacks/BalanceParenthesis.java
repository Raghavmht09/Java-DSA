package Stacks;
import java.util.*;
public class BalanceParenthesis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> st = new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
      if(ch=='('||ch=='{'||ch=='[') {

	}
      else if(ch==')') {
		if(st.size()==0) {
			System.out.print(false);
			return;
		}else if(st.peek()!='(') {
			System.out.print(false);
			return;
		}else {
			st.pop();
		}
		}
      else if(ch=='}') {
    	  if(st.size()==0) {
  			System.out.print(false);
  			return;
  		}else if(st.peek()!='}') {
  			System.out.print(false);
  			return;
  		}else {
  			st.pop();
  		}
    	  
      }	
      else if(ch==']') {
    	  if(st.size()==0) {
  			System.out.print(false);
  			return;
  		}else if(st.peek()!=']') {
  			System.out.print(false);
  			return;
  		}else {
  			st.pop();
  		}
    	  
      }
      else {
    	  
      }
      
      
      
	}
		if(st.size()==0) 	System.out.print(true);
		else 	System.out.print(false);
	
		
	}
}
