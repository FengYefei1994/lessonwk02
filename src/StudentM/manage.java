package StudentM;

import java.util.Arrays;
import java.util.Scanner;

public class manage {
	Scanner input = new Scanner(System.in);

	// 增加学员方法1
	public String[] addStudent(String[] student) {
		String a = null;
		do {
			System.out.print("要增加学员院的姓名为：");
			String name1 = input.next();
			int k = 0;
			for (int i = 0; i < student.length; ++i) {
				if (student[i].contentEquals(name1)) {
					++k;
					System.out.println("添加失败，该学员已经存在！");
					break;
				}
			}
			if (k == 0) {
				Arrays.copyOf(student, student.length + 1);
				student[student.length - 1] = name1;
				System.out.println("添加成功！");
			}
			System.out.println("继续添加请按“y//Y”，其他键退出！");
			a = input.next();
		} while ("Y".equals(a) || "y".equals(a));
		return student;
	}

	// 增加学员方法2
	public void addStudent2(String[] student, String s) {
		int k = 0;
		for (int i = 0; i < student.length; ++i) {
			if (student[i].contentEquals(s)) {
				++k;
				System.out.println("添加失败，该学员已经存在！");
				break;
			}
		}
		if (k == 0) {
			Arrays.copyOf(student, student.length + 1);
			student[student.length - 1] = s;
			System.out.println("添加成功！");
		}
	}

	// 查找学员方法1
	public void Judge1(String[] student) {
		System.out.print("要查找学员的姓名为：");
		String name1 = input.next();

		// 判断起点是否OK
		int first = 0, end = 0;
		for (int i = 0;; ++i) {
			System.out.print("查找起始点：");
			first = input.nextInt();
			if (0 < first && first < student.length) {
				break;
			} else {
				System.out.println("输入查找起始点超出范围，请重新输入！");
			}
		}

		// 默认终点只需比起点大，查找时终点默认取输入值与数组长度小值
		for (int i = 0;; ++i) {
			System.out.print("查找终点：");
			end = input.nextInt();
			if (first < end) {
				break;
			} else {
				System.out.println("输入查找终点超出范围，请重新输入！");
			}
		}

		int j = end <= student.length ? end : (student.length);
		int k = 0;
		for (int i = first - 1; i < j; ++i) {
			if (name1.equals(student[i])) {
				++k;
				System.out.println("查找成功！");
				break;
			}
		}
		if (k == 0) {
			System.out.println("查无此人！");
		}
	}

	// 查找学员方法2

	public void Judge2(String[] student, String s, int first, int end) {

		// 判断起始点，并预设查找范围
		if (0 >= first || student.length <= first) {
			first = 1;
		}

		// 判断终止点，并预设查找范围
		if (end < first) {
			end = student.length;
		}

		int j = end <= student.length ? end : (student.length);
		int k = 0;
		for (int i = first - 1; i < j; ++i) {
			if (s.equals(student[i])) {
				++k;
				System.out.println("查找成功！");
				System.out.println(s);
				break;
			}
		}
		if (k == 0) {
			System.out.println("查无此人！");
		}
	}
}
