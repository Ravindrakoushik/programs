package programs.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDebugg {
	static String s1="FB";
	static String s2="Ea";

	public static void main(String[] args) {
    Map<String,Integer> map=new HashMap<String,Integer>();
   
    map.put(s1, 1);
    map.put(s2, 2);
   
   System.out.println(map);
  
    
	}

}
