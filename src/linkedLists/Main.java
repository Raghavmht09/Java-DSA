package linkedLists;
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
	linkedlist list = new linkedlist();
	int n =sc.nextInt();
	for(int i=0;i<n;i++ ) {
		int data=sc.nextInt();
		list.insertend(data);
	}
//		int element = sc.nextInt();
//		list.insertsorted(element);
//	list.reverse();
	list.isPalindrome(n);
		list.printall();
		
		}
	}

}
