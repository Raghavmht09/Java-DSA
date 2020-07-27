package interviewQues;
import java.util.*;
public class GroupAnagrams {
 static class Solution{
	 public List<List <String>> groupAnagrams (String[] strs) {
		Map  < String , List<String>> map= new HashMap<>();
		for (String s:strs) {
			char[]charArray = s.toCharArray();
			Arrays.parallelSort(charArray);
			String Sorted= new String(charArray);
			 
			if(!map.containsKey(Sorted)) {
				map.put(Sorted, new LinkedList<String>());
			}
			map.get(Sorted).add(s);
		}
				return new LinkedList<>(map.values() );

		}

	 
	 
	 
	 
	 
	 
 }
	
}
