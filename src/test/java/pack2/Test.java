package pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	
	public static void main(String[] args) {
		A a=(b,c)-> System.out.println("Sum= "+(b+c));
		a.m1(10,20);
		a.m1(98, 67 );
		
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(15);
		l.add(5);
		l.add(20);
		l.add(10);
		System.out.println(l);
		
		Comparator<Integer> c=(i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
		Collections.sort(l,c);
		System.out.println(l);
	}

}
