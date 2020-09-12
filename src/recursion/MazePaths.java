package recursion;
import java.util.*;
public class MazePaths {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m= sc.nextInt();
		ArrayList<String> paths = getPaths(1,1,n,m);
	
		System.out.println(paths);
		
	}

	private static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {
		ArrayList<String> hpath = new ArrayList<String>();
		ArrayList<String> vpath = new ArrayList<String>();
		
		if(sr==dr&& sc==dc) {
			ArrayList<String> base = new ArrayList<String>();
			base.add("");
			return base;
			
		}
		
		
		if(sc<dc) {
			hpath=getPaths(sr, sc+1, dr, dc);
		}
		if(sr<dr) {
			vpath=getPaths(sr+1, sc, dr, dc);
		}
		
		ArrayList<String> paths = new ArrayList<String>();
		for(String h:hpath) {
			paths.add('h'+h);
		}
		for(String v:vpath) {
			paths.add('v'+v);
		}
		return paths;
	}

}
