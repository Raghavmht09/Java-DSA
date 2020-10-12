package Stacks;
import java.util.*;

public class Smallestnopattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		
		int num=1;
		Stack<Integer> st = new Stack<>();
		for(int i =0; i<str.length() ;i++) {
			char ch = str.charAt(i);
			
			if(ch=='d') {
				st.push(num);
				num++;
				
			}else {
				st.push(num);
				num++;
				while(st.size()>0) {
				System.out.print(st.pop());
				}
			}
					
		}
		
		
	st.push(num);
	while(st.size()>0) {
		System.out.print(st.pop());
		}
	}

}
