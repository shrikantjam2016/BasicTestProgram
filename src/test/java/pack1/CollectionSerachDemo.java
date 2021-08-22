package pack1;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionSerachDemo {
	public static void main(String[] args) {
		ArrayList<Integer> it=new ArrayList<Integer>();
		it.add(15);
		it.add(0);
		it.add(20);
		it.add(10);
		it.add(5);
		System.out.println(it);
		Collections.sort(it);
		System.out.println(it);
		Collections.sort(it, new MyComparator());
		System.out.println(it);
		Collections.reverse(it);
		System.out.println(it);
	}

}
