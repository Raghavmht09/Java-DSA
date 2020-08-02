package Greedyalgo;

public class BalanceParen {
	static int  SwapCount(String s){
		char[] chars=s.toCharArray();
		
		int countleft = 0,countright=0,swap=0,imbalance=0;
		
		for(int i=0;i<chars.length;i++) {
			if(chars[i]=='[') {
				countleft++;
				if(imbalance>0) {
					swap+=imbalance;
					imbalance--;
				}
				}
				else if(chars[i]==']'){
					countright++;
					imbalance=countright-countleft;
				}
				
			}
		return swap;
		}
		

		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s = "[]][]["; 
	        System.out.println(SwapCount(s) ); 
	  
	        s = "[[][]]"; 
	        System.out.println(SwapCount(s) );

	}

}
