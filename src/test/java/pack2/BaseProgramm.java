package pack2;

import java.util.Arrays;

public class BaseProgramm {
	public static void main(String[] args) {
	//twoD();
	//addTest();
	sorttest();
		
	
	

}

	private static void sorttest() {
		int[] a= {56,45,35,89,74,56,12,12,96,6};
		Arrays.sort(a);
		for(int b:a)
			System.out.println(b);
		
	}

	private static void addTest() {
		int a=10;
		System.out.println(a++);
		System.out.println(++a);
		System.out.println(a--);
		System.out.println(--a);
		
	}

	private static void twoD() {
		int[][] a= {{2,3,4}, {5,1,2}, {4,2,5}, {2,3}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		}
		
	}

