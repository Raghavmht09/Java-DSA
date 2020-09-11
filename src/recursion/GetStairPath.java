package recursion;
import java.util.*;
public class GetStairPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		ArrayList<String> res = getPath(n);
		System.out.println(res);
	}

	private static ArrayList<String> getPath(int n) {
		if(n==0) {
			ArrayList<String> bres=new ArrayList<String> ();
			bres.add("");
			return bres;
		}else {
			if(n<0) {
				ArrayList<String> bres=new ArrayList<String> ();
				return bres;
			}
		}
		
		ArrayList<String> path1 = getPath(n-1);
		ArrayList<String> path2 = getPath(n-2);
		ArrayList<String> path3 = getPath(n-3);
		ArrayList<String> paths= new ArrayList<String>();
		
		for(String path:path1) {
			paths.add(1+path);
		}
		for(String path:path2) {
			paths.add(2+path);
		}
		for(String path:path3) {
			paths.add(3+path);
		}
		return paths;
		
	}

}
