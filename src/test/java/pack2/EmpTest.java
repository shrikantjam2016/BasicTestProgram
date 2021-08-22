package pack2;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmpTest {
	public static void main(String[] args) {
		
//	emptest();
//	numberEvenorNot();
//	functionMethod();
//	testStudent();
		listOfFailed();
		
	}

	private static void listOfFailed() {
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(50);
		l.add(10);
		l.add(70);
		l.add(55);
		l.add(25);
		long i=l.stream().filter(m->m<35).count();
		System.out.println(i);

		
	}

	private static void testStudent() {
		Function<Student, String> f=s->{
			int marks=s.marks;
			String grade="";
			if(marks>=80) grade="A[Dist]";
			else if(marks>=60) grade="B[First]";
			else if(marks>=50) grade="C[SC]";
			else if(marks>=35) grade="D[TC]";
			else grade="E[Failed]";
			return grade;
		};
		
		Student[] s= {new Student("sunny", 57), 
				new Student("munny", 87),
				new Student("tunny", 35),
				new Student("cunny", 57),
				new Student("zunny", 20)};
		
		for(Student s1:s)
		{
			System.out.println("NAme of Student"+s1.name);
			System.out.println("Marks"+s1.marks);
			System.out.println("Grade of Student"+f.apply(s1));
			System.out.println();
		}
		
		
	}

	private static void functionMethod() {
		Function<String, Integer> ab=i->i.length();
		System.out.println(ab.apply("dugra the"));
		
	}

	private static void numberEvenorNot() {
	int[] x= {2,6,2,9,30,5,7,8,11,10};
	Predicate<Integer> p1=i->i%2==0;
	Predicate<Integer> p2=i->i>10;
	System.out.println("The nmber which are even and > 10 are");
	
	for(int x1:x)
	{
		if (p1.and(p2).test(x1)) {
			System.out.println(x1);
			
		}
	}
	
	
		
	}

	private static void emptest() {
		
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Dura", 10000));
		l.add(new Employee("Munge", 50000));
		l.add(new Employee("Sagar", 60000));
		l.add(new Employee("Dinasehs",30000));
		l.add(new Employee("Baban", 40000));
		l.add(new Employee("Chetan", 20000));
		
		Predicate<Employee> p=e->e.salary>30000;
		
		for(Employee v:l)
		{
			if(p.test(v))
			{
				System.out.println(v.name+" : "+v.salary);
			}
		}
		
	}

}
