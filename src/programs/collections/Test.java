package programs.collections;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
    Set<Integer> set=new HashSet<Integer>();
    set.add(100);
    set.add(null);
    System.out.println(set);
	}

}
