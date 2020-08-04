package Greedyalgo;

import java.util.ArrayList;

public class PolicecatchesThiefProblem {
	public static int policethief(char[] arr,int n, int k) {
		int res=0;
		ArrayList<Integer> Pol= new ArrayList<>();
		ArrayList<Integer> Thi= new ArrayList<>();
		for (int i=0;i<n;i++) {
			if(arr[i]=='P') 
				Pol.add(i);
		
			else if (arr[i]=='T') Thi.add(i);
	}
		
		int l=0,r=0;
		while(l<Thi.size()&& r<Pol.size()) {
			if (Math.abs(Thi.get(l)-Pol.get(r))<=k) {
				res++;
				l++;
			}
				else if (Thi.get(l)<Pol.get(r))
					l++;
				else 
					r++;
			}
		return res;
		}
		
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
int k,n;
char[] arr= new char[]{'P','T','T','P','T'};
k=2;
n=arr.length;
System.out.println(policethief(arr,n,k));
		}

	}


