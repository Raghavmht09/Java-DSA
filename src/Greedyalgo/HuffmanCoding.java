package Greedyalgo;
import  java.util.*;
class HuffmanNode{
	int data;
	char c;
	HuffmanNode left;
	HuffmanNode right;
}

class Compare implements Comparator<HuffmanNode>{

	@Override
	public int compare(HuffmanNode x, HuffmanNode y) {
		
		return x.data-y.data;
	}
	
}
public class HuffmanCoding {
 
	public static void print(HuffmanNode root,String s) {
		if(root.left==null && root.right==null && Character.isLetter(root.c)) {
			System.out.println(root.c+" :" +s);
		return;
		}
		print(root.left,s+"0");
		print(root.right,s+"1");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=6;
		char[] charArr= {'a','b','c','d','e','f'};
		int[] freqArr= {2,5,8,9,10,11};
		PriorityQueue<HuffmanNode> q= new PriorityQueue<>(n,new Compare());
	for(int i = 0;i<n;i++) {
		HuffmanNode hn= new HuffmanNode();
	
	hn.c=charArr[i];
	hn.data=freqArr[i];
	q.add(hn);
	
	}
	HuffmanNode root=null;
	while(q.size()>1) {
		HuffmanNode x=q.peek();
		q.poll();
		
		HuffmanNode y=q.peek();
		q.poll();
		 
		HuffmanNode f =new HuffmanNode ();
		f.data=x.data + y.data;
		f.c='-';
		f.left=x;
		f.right=y;
		root=f;
		q.add(f);
		
	}
	print(root," ");
	}

}
