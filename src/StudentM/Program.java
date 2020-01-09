package StudentM;

import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		String[] student=new String[] {"张三","李四","顽固","甲方","那几","叫你"};
		manage manage1=new manage();
		
		//增加学员1
		//manage1.addStudent(student);
		//System.out.println(Arrays.toString(student));
		
		// 增加学员2
		manage1.addStudent2(student, "几顿饭");
		System.out.println(Arrays.toString(student));
		
		//查找学员方法1
		//manage1.Judge1(student);
		
		//查找学员方法2
		//manage1.Judge2(student, "顽", 0, 4);
	}
}
