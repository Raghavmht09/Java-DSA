package Greedyalgo;
import java.util.*;
public class WaterConnection {

	static int n,p;
	// arr rd stores Ending indexes of pipes
	static int rd[]=new int[1100];
	//arr cd stores Starting indexes of pipes
	static int cd[]=new int[1100];
	//arr wt stores values of diameteres b/w pipes
	static int wt[]= new int[1100];
			//arraylist a,b,c are used to store final outputs respectively
	static ArrayList<Integer> a=new ArrayList<> ();
	static ArrayList<Integer> b=new ArrayList<> ();
	static ArrayList<Integer> c=new ArrayList<> ();
	
	static int ans;
	
	// performing dfs to find the apt houses 
	static int dfs (int w) 
	{
		if (cd[w]==0)
			return w;
		if(wt[w]< ans)
			ans=wt[w];
		else
			return dfs(cd[w]);
		
	}
	static void solve(int arr[][]) {
		int i=0;
		while(i<p) {
			int q= arr[i][0];
			int h=arr[i][1];
			int t=arr[i][2];
			
			cd[q]=h;
			rd[h]=q;
			wt[q]=t;
			i++;
		}
		a= new ArrayList<>();
		b= new ArrayList<>();
		c= new ArrayList<>();
	
		for(int j=1;j<=n;++j) {
			if(rd[j]==0 && cd[j]>0) {
				ans=100000000;
				int w=dfs(j);
				
				a.add(j);
				b.add(w);
				c.add(ans);
				
			}
			
			System.out.println(a.size());
			
			for(;j<a.size();j++)
				System.out.println(a.get(j)+" "+b.get(j)+" "+c.get(j));
			
			
		}
			
	}
	public static void main(String[] args) {
		n=9;
		p=6;
		for(int i = 0; i < 1100; i++) 
            rd[i] = cd[i] = wt[i] = 0; 
          
        int arr[][] = { { 7, 4, 98 }, 
                        { 5, 9, 72 }, 
                        { 4, 6, 10 }, 
                        { 2, 8, 22 }, 
                        { 9, 7, 17 }, 
                        { 3, 1, 66 } }; 
        solve(arr); 

	}

}
