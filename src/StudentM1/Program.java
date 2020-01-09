package StudentM1;

public class Program {


	public static void main(String[] args) {
		Student[] s=new Student[2];
		
		Student s1=new Student();
		s1.name="张三";
		s1.score=65;
		s[0]=s1;
		
		Student s2=new Student();
		s2.name="李四";
		s2.score=45;
		s[1]=s2;

		manage m1=new manage();
		m1.showIn(s);
	}

}
