package DynamicProgramming;

import java.util.Scanner;
import java.util.*;
public class BinaryCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
      int n= sc.nextInt();
      int oczeroes=1;
      int ocones=1;
      
      for(int i=2;i<=n;i++) {
    	  int nczeroes=ocones;
    	int ncones=	oczeroes+ocones;
    	
    	oczeroes=nczeroes;
    	ocones=ncones;
      }
      System.out.println(oczeroes+ocones);
	}

}
