package pack2;

import java.util.function.Predicate;

public class BB {

	public static void main(String[] args) {
		
		Predicate<Integer> a=i->i%2==0;
		System.out.println(a.test(50));
		Predicate<String> st=s->s.length()==5;
		System.out.println(st.test("string"));
		
		String[] ab= {"arr", "ygoie", "aishpoa", "IUGHPO", "dfb"};
		
		Predicate<String> tt=l->l.length()%2==0;
		for(String l1:ab)
		{
			if (tt.test(l1))
			{
				System.out.println(l1);
			}
		}
	}

}
