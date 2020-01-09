package StudentM1;

public class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public Student() {

	}

	// 显示姓名和成绩
	public void show() {
		System.out.println(name + "的成绩是" + score);
	}
}
